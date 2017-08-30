
public class Driver {

 public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
	 
    // Creating the list
    list.insertAtBeggining(2);
	list.insertAtEnd(3);
    list.insertAtBeggining(1);
	list.insertAtEnd(4);
	list.insertAt(0,2);

	System.out.println("Linked list is: ");
	list.print(list.head);
	System.out.println("");
	
	System.out.println("Printing in reverse using recursion :");
	list.printReverse(list.head);
	System.out.println("");
	
	System.out.println("Deleting element at position 2");
	list.deleteNode(list.head,2);
	System.out.println("Linked list is: ");
	list.print(list.head);
	System.out.println();
	
	System.out.println("\nCreated Linked list is: ");
	list.print(list.head);
	list.head = list.reverse(list.head);
	System.out.println("");
	System.out.println("Reversing the linked list ");
	list.print(list.head);
	
	Node ress = list.reverseRecursive(list.head, null);
	System.out.println("");
	System.out.println("");
	System.out.println("Reversing the linked list using recursion ");
	list.print(ress);
  }
}
