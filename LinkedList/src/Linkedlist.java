
public class Linkedlist {

	// header for LinkList
	Node head;
	
	// print the data in the node
	public void printList()
	{
		Node n = head;
		while (n != null)
		{
			System.out.println(" " + n.data + " ");
			n = n.next;
		}
	}
	
	// add to the header
	public void push(int data)
	{
		// create new node with data
		Node n = new Node(data);
		
		// make new node point to previous header 
		n.next = head;
		
		// make header the new node
		head = n;
	}
	
	
	// insert new node with data
	public void add(Node prev_node, int data)
	{
		// create a new node 
		Node new_node = new Node(data);

		//if we are adding to empty node
		if (head == null)
		{
			System.out.println("You are trying to add it to the begining");
			new_node = head;
			new_node.next = null;
		}
		//if we are trying to insert in the end
		else if (prev_node.next == null)
		{
			System.out.println("You are trying to add it to the end");
			prev_node.next = new_node;
			new_node.next = null;

		} else
		{
			// Node inserted in the middle
			System.out.println("You are trying to add it to the middle");
			new_node.next = prev_node.next;
			prev_node.next = new_node;
		}
		
	}
	
	// insert new data only in the end
	public void append(int data)
	{
		Node n = head;
		Node new_node = new Node(data);
		
		// walk through the list until end
		while (n.next != null)
		{
			n = n.next;
		}
		if (n.next == null)
		{	
			n.next = new_node;
			new_node.next = null;
		}
	}
	
	
}



