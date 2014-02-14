package io.jimmyliao.practice;


public class Llist {
	// Private Class for Linked List Data Structure	
	private class LL{
		private String value;
		private LL next;
		
		public LL(String val) {
			this.value = val;
			this.next = null;
		}
		
		public void add() {
			
		}
		
		public void remove() {
			
		}
		
		public void testInnerMethod(){
			System.out.println("testInnerMethod");
		}

	}	
	// End of Private Class
	
	// class member declaration
	LL head;
	
	public Llist() {
		head = null;
	}

	public static void main(String[] args) {
//		linkedlistTest llist = new linkedlistTest();
//		linkedlistTest.LL li = llist.new LL();
//		li.testInnerMethod();
	}
	
	public void printAll() {
		LL current = this.head;

        while(current != null){
            System.out.print(current.value+" ");
            current = current.next;
        }
        System.out.println();
	}

}
