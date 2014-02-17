package io.jimmyliao.practice;

// Demonstrate the Stack class.
import java.util.*; 

public class stack {

  static void showpush(Stack st, int a) {
    st.push(new Integer(a));
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showpop(Stack st) {
    System.out.print("pop -> ");
    Integer a = (Integer) st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  } 

  /**
   * @param args
   */
  public static void main(String[] args) {

  }

}
