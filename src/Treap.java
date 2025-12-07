package aed.treap;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.tree.LinkedBinaryTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Treap<E extends Comparable<E>> implements Iterable<E> {
  private LinkedBinaryTree<Pair<E,Integer>> treap;
  private Random rand;

  public Treap() {
    this.treap = new LinkedBinaryTree<Pair<E,Integer>>();
    this.rand = new Random();
  }
  
  public int size() {
    
    if(treap.isEmpty())
      return 0;

    int size=1;   
    size=size+recorrerTreap(treap.root(),0,treap);

    return size;
  }

  public boolean isEmpty() {
    return treap.isEmpty();
  }

  public boolean add(E e) {
    if(e==null)
      throw new IllegalArgumentException();

    if(treap.isEmpty()){
      treap.addRoot(new Pair<>(e, rand.nextInt()));
      return true;
    }

    boolean esta=colBuscNodo(treap.root(),e,treap, true);

    if(!esta)
      return esta;

    
    Position<Pair<E,Integer>> pivot = eToRemove(treap.root(),e,treap);
    Integer prioridad = pivot.element().getRight();

      while(!treap.isRoot(pivot) && prioridad<treap.parent(pivot).element().getRight()){
        treap.rotate(pivot);
      }
      
    return true;
  }

  public boolean remove(E e) {
    if(e==null)
    throw new IllegalArgumentException();

    if(treap.isEmpty())
      return false;
    
    boolean esta = colBuscNodo(treap.root(),e,treap, false);

    if(!esta)
      return esta;

    Position<Pair<E,Integer>> padreARotar = eToRemove(treap.root(),e,treap);

    while(treap.isInternal(padreARotar)){

      Position<Pair<E,Integer>> pivot;
      
      if(treap.hasLeft(padreARotar) && treap.hasRight(padreARotar)){
        if(treap.left(padreARotar).element().getRight()<treap.right(padreARotar).element().getRight())
          pivot=treap.left(padreARotar);
        else
          pivot=treap.right(padreARotar);
      }
        
      else if(treap.hasLeft(padreARotar))
        pivot=treap.left(padreARotar);
        
      else
        pivot=treap.right(padreARotar);

      treap.rotate(pivot);
    }

    treap.remove(padreARotar);
    
    return true;
  }

  
  public boolean contains(E e) {
    if(e==null)
      throw new IllegalArgumentException();
    
    if(treap.isEmpty())
      return false;
    
      return buscTreap(treap.root(),treap,treap.root().element().getLeft().equals(e),e); 
  }

  @Override
  public Iterator<E> iterator() {
    return ordenador().iterator();
  }
  
  @Override
  public String toString() {
    return treap.toString();
  }
/******************************************************Métodos auxiliares******************************************************/

  /**
   * El metodo recorre el Treap devolviendo el numero de nodos que contiene.
   *
   * Usado por: size().
   */

  private int recorrerTreap (Position<Pair<E,Integer>> nodo,int size,LinkedBinaryTree<Pair<E,Integer>> treap){
    for(Position<Pair<E,Integer>> hijo:treap.children(nodo)){
      size = size+recorrerTreap(hijo,1,treap);

    }
      return size;
  }

  /**
   * El metodo eToRemove devuelve el nodo a remover del Treap  
   *
   * Usado por: remove().
   */
  private Position<Pair<E,Integer>> eToRemove(Position<Pair<E,Integer>> nodo, E e, LinkedBinaryTree<Pair<E,Integer>> treap){
    if(e.compareTo(nodo.element().getLeft())<0 && treap.hasLeft(nodo))
      return eToRemove(treap.left(nodo),e,treap);

    else if(e.compareTo(nodo.element().getLeft())>0 && treap.hasRight(nodo))
      return eToRemove(treap.right(nodo),e,treap);

    else
      return nodo;
  }

/**
 * El metodo colBusNodo tiene dos modalidades:
 *    Si add=true-->Añade un nodo al Treap interpretandolo como si solo fuera un binaryTree.
 *    Si add=false-->Busca si el nodo existe en el Treap
 *
 * Usado por: remove() y add().
 */
  private boolean colBuscNodo(Position<Pair<E,Integer>> nodo, E e, LinkedBinaryTree<Pair<E,Integer>> treap, boolean add){
    //Si add es true, se añade el elemento, si es false, se busca el elemento.
    if(e.compareTo(nodo.element().getLeft())<0 && treap.hasLeft(nodo))
      return colBuscNodo(treap.left(nodo),e,treap, add);

    else if(e.compareTo(nodo.element().getLeft())>0 && treap.hasRight(nodo))
      return colBuscNodo(treap.right(nodo),e,treap, add);

    else if(e.compareTo(nodo.element().getLeft())==0){
       if(add) 
        return false;

      else
        return true;
    }

    else if(add){
      if(e.compareTo(nodo.element().getLeft())<0)
          treap.insertLeft(nodo, new Pair<>(e, rand.nextInt()));
      else
          treap.insertRight(nodo, new Pair<>(e, rand.nextInt()));

      return true;
    }
    return false;
  }

  /**
   * Este metodo recorre el Treap y devuleve si contiene o no un nodo con el valor que se busca
   *
   * Usado por: contains().
   */

  private boolean buscTreap(Position<Pair<E,Integer>> nodo, LinkedBinaryTree<Pair<E,Integer>> treap, boolean esta, E e){

    if(esta)
      return true;

    for(Position<Pair<E,Integer>> hijo:treap.children(nodo)){
      esta=esta || buscTreap(hijo,treap,hijo.element().getLeft().equals(e),e);
    }

    return esta;
  } 

  /**
   * El metodo ordenador retorna un LinkedBinaryTree cuyo orden es ascendente.
   * Es decir, el arbol retornado sera un conjunto de nodos en linea que solo tienen hijos derechos.
   *
   * Usado por: iterator()
   */

  private LinkedBinaryTree<E> ordenador(){

    LinkedBinaryTree<E> result = new LinkedBinaryTree<>();

    if (treap.isEmpty()) {
        return result;
    }

    Pair<E, Integer>[] pairs = treap.toArray(new Pair[0]);
    List<E> elementsList = new ArrayList<>();
    for (int t = 0; t < pairs.length; t++) {
        elementsList.add(pairs[t].getLeft());
    }
    E[] elements = elementsList.toArray((E[]) new Comparable[elementsList.size()]);

    for(int t = 0; t<treap.size(); t++){
      E neww = elements[t];
      if(t>0 && neww.compareTo(elements[t-1])<0){
        E aux = elements[t-1];
        elements[t-1] = neww;
        elements[t] = aux;
        t=0;
      }
      else if(t<treap.size()-1 && neww.compareTo(elements[t+1])>0){
        E aux = elements[t+1];
        elements[t+1] = neww;
        elements[t] = aux;
        t=0;
      }
      System.out.print("[");
      for(int k = 0; k<treap.size(); k++)
        System.out.print(elements[k]+" ,");
      System.out.println("]");
    }
    Position<E> raiz = result.addRoot(elements[0]);
    for(int t = 1; t<elements.length; t++){
      raiz = result.insertRight(raiz, elements[t]);

    } 
    return result;
  }
}