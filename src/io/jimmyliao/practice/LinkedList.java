package io.jimmyliao.practice;

import io.jimmyliao.practice.LinkNode;

public class LinkedList {
    LinkNode head;
    private int listCount;

    public LinkedList() { 
       head = new LinkNode(null);
       listCount = 0;
    }

    public void add(String item) { 
      LinkNode tmp = new LinkNode(item);
      LinkNode current = head;

      while(current.getNext() != null) {
        current = current.getNext();
      }

      current.setNext(tmp);
      listCount++;

    }

    public void add(String item, int index) { 
      LinkNode tmp = new LinkNode(item);
      LinkNode current = head;

      for(int i=1; ((i<index) && (current.getNext() !=null) ); i++)
      {
        current = current.getNext();
      }

      tmp.setNext(current.getNext());
      current.setNext(tmp);
      listCount++;

    }

    public String get(int index) {
        if(index <= 0)
          return null;

        LinkNode current = head.getNext();
        for(int i=1; i< index; i++)
        {
          if(current.getNext() ==null)
            return null;
          current = current.getNext();
        }

        return current.getData();
    }

    public boolean remove(int index) {
      if(index<1 || index > size())
        return false;

      LinkNode current = head;

      for(int i=0; i<=index; i++) {
        if(current.getNext() == null)
          return false;
        current = current.getNext();

      }

      current.setNext( current.getNext().getNext() );
      listCount--;
      return true;
    }

    public int size() {
        return listCount;
    }

    public static void main(String[] args) {

      LinkedList list = new LinkedList();
      list.add("a");
      list.add("m");
      list.add("h");
      list.add("y");


      System.out.println("print linkedlist=" + list);
      System.out.println("get size=" + list.size());
      System.out.println("get 1st=" + list.get(1));
      System.out.println("get size=" + list.size());
      System.out.println("get 2nd=" + list.get(2));
      System.out.println("get size=" + list.size());
      System.out.println("get 3nd=" + list.get(3));
      System.out.println("get size=" + list.size());
    }

}
