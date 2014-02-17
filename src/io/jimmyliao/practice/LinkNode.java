package io.jimmyliao.practice;

public class LinkNode { 
    String data;
    LinkNode next;

    public LinkNode(String item) { 
       data = item;
       next = null;
    }

    public LinkNode(String item, LinkNode nextNode) {
        next = nextNode;
        data = item;
    }

    public String getData() {
        return data;
    }

    public void setData(String dataVal) {
      data = dataVal;
    }
    
    public LinkNode getNext() {
      return next;
    }

    public void setNext(LinkNode val) {
      next = val;
    }
}
