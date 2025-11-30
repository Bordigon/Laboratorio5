package aed.treap;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import java.util.Iterator;
import java.util.Random;

public class Treap<E extends Comparable<E>> implements Iterable<E> {
  private LinkedBinaryTree<Pair<E,Integer>> treap;
  private Random rand;

  public Treap() {
    this.treap = new LinkedBinaryTree<Pair<E,Integer>>();
    this.rand = new Random();
  }
  
  public int size() {
    return -1;
  }

  public boolean isEmpty() {
    return false;
  }

  public boolean add(E e) {
    return true;
  }

  public boolean remove(E e) {
    return true;
  }

  public boolean contains(E e) {
    return true;
  }

  public Iterator<E> iterator() {
    return null;
  }
  
  @Override
  public String toString() {
    return treap.toString();
  }
  
}
