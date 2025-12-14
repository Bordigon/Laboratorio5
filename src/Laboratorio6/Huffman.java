package aed.huffman;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.priorityqueue.*;

public class Huffman {

  public static Map<Character,Integer> frequencies(String texto) {
    char charAux;
    Integer count =0;
    Map<Character,Integer> freq=new HashTableMap<>();
    
    for(int i=0;i<texto.length();i++){
      charAux = texto.charAt(i);
      
      if(freq.containsKey(charAux)){
        count = freq.get(charAux);
        freq.remove(charAux);
        freq.put(charAux, count+1);
      }
        
      else
        freq.put(charAux,1);
    }
    return freq;
  }

  public static BinaryTree<Character> constructHuffmanTree(Map<Character,Integer> mapa) {
    PriorityQueue<Integer, BinaryTree<Character>> Q=new HeapPriorityQueue<>();

    for(Entry<Character,Integer> entry:mapa.entries()){
    BinaryTree<Character> tree=new LinkedBinaryTree<>();
    tree.addRoot(entry.getKey());
    Q.enqueue(entry.getValue(),tree);
    }
    
    BinaryTree<Character> tree=null;

    while(Q.size()>1){
    	Entry<Integer, BinaryTree<Character>> left=Q.dequeue();
    	Entry<Integer, BinaryTree<Character>> right=Q.dequeue();
	tree = joinTrees(' ',left.getValue(),right.getValue());
	Q.enqueue(left.getKey()+right.getKey(),tree);
    }

    return tree;
  }
  

  public static <E> BinaryTree<E> joinTrees(E e, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
    BinaryTree<E> tree= new LinkedBinaryTree<E>();

    tree.addRoot(e);
    
    if(!leftTree.isEmpty()){
      tree.insertLeft(tree.root(), leftTree.root().element());
      insertSubTree(leftTree.root(), tree.left(tree.root()), tree, leftTree);
    }
    
    if(!rightTree.isEmpty()){
      tree.insertRight(tree.root(), rightTree.root().element());
      insertSubTree(rightTree.root(), tree.right(tree.root()), tree, rightTree);
    }
    return tree;
  }

private static <E> void insertSubTree(Position<E> nodoSubTree, Position<E> nodoTree, BinaryTree<E> tree, BinaryTree<E> subTree){
  if(subTree.hasLeft(nodoSubTree)){
    Position<E> hijoLeft=subTree.left(nodoSubTree);
    
    tree.insertLeft(nodoTree, hijoLeft.element());
    insertSubTree(hijoLeft,tree.left(nodoTree),tree,subTree);
  }
    
  if(subTree.hasRight(nodoSubTree)){
    Position<E> hijoRight=subTree.right(nodoSubTree);

    tree.insertRight(nodoTree, hijoRight.element());
    insertSubTree(hijoRight,tree.right(nodoTree),tree,subTree);
  }
}

  public static Map<Character,String> characterCodes(BinaryTree<Character> tree) {
    Map<Character,String> codesMap= new HashTableMap<Character,String>();
    recTree(tree.root(),tree,"",codesMap);
    
    return codesMap;
  }

  private static void recTree(Position<Character> nodo ,BinaryTree<Character> tree, String code,  Map<Character,String> codesMap){

    if(tree.isExternal(nodo))
      codesMap.put(nodo.element(), code);
    
    else{
      if(tree.hasLeft(nodo))
        recTree(tree.left(nodo),tree,code+"0",codesMap);
        
      if(tree.hasRight(nodo))
        recTree(tree.right(nodo),tree,code+"1",codesMap);  
    }     
  }

  public static String encode(String text, Map<Character,String> map) {
    String codeString="";
    String code;
    Character letra;
    
    for(int i=0;i<text.length();i++){
      letra=text.charAt(i);
      code=map.get(letra);
      
      if(code!=null)
        codeString=codeString+code;
        
      else
        codeString=codeString+letra;
    }
    
    return codeString;
  }

  public static String decode(String encodedText, BinaryTree<Character> huffmanTree) {
    String decoded ="";
    Character bit;
    Position<Character> root = huffmanTree.root();
    
    for(int t = 0; t<encodedText.length();t++){
      bit = encodedText.charAt(t);
        if(bit == '0')
          root = huffmanTree.left(root);
        
        else
          root = huffmanTree.right(root);

        if(huffmanTree.isExternal(root)){
          bit = root.element();
          decoded += bit;
          root = huffmanTree.root();
        }
    } 
    return decoded;
  }  
}
