
public class MainClass {

	public static void main(String[] args) {

		// object reference to linked list 
		Linkedlist list = new Linkedlist();
		
		// object reference to nodes for header and rest;
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
				
		// single linked list pointing 
		list.head.next = second;
		second.next = third;
		third.next = null;
				
		list.printList();
		

		
	}
	


}
