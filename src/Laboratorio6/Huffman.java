package aed.huffman;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.priorityqueue.*;


public class Huffman {

  public static Map<Character,Integer> frequencies(String texto) {
    return null;
  }

  public static BinaryTree<Character> constructHuffmanTree(Map<Character,Integer> charCounts) {
    return null;
  }

  public static <E> BinaryTree<E> joinTrees(E e,
                                            BinaryTree<E> leftTree,
                                            BinaryTree<E> rightTree) {
    return null;
  }

  public static Map<Character,String> characterCodes(BinaryTree<Character> tree) {
    return null;
  }

  public static String encode(String text, Map<Character,String> map) {
    return null;
  }

  public static String decode(String encodedText, BinaryTree<Character> huffmanTree) {
    return null;
  }

  
}
