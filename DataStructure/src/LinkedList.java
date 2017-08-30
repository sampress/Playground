
public class LinkedList {

 static Node head;

 public void insertAtBeggining(int x)
  {
    // Creating a new node and shifting the head pointer to the new node 
	Node newNode = new Node(x);
	// Creates a link b/w the new node and previous 1st node
	newNode.next = head;
	// Now set the head pointer to the new node
	head = newNode;
  }
	 
 public void insertAt(int x, int pos)
  {	
	// Creating new node
	Node newNode = new Node(x);
	// If adding at the start of the linked list, simply adjust the head to the new node
	if(pos == 1)
     {
	   newNode.next = head;
	   head = newNode;
	   return;
	 }
		 
    Node node1 = head;
	// Loop to find the pos-1 node
	for(int i = 0; i < pos-2; i++)
     {
	   node1 = node1.next;
	 }
	// Linking the newNode to to pos-1 node
	newNode.next = node1.next; // Exchanging the links
	node1.next = newNode; // Pos-1 node now points to the newNode
  }
	 
 public void insertAtEnd(int x)
  {
	Node newNode = new Node(x);
	if(head == null)
	  {
	    head = new Node(x);
	    return;
	  }
	newNode.next = null;
	Node node = head; 
	while(node.next != null)
	  node = node.next;
	  node.next = newNode;
	    
    return;
  }
	 
 void deleteNode(Node head,int pos)
  {
    // To check if empty
	if(head == null)
	  return;
	    
    Node node = head;
	    
	// For removing the head of the linked list
	if(pos == 0)
	  {
	    // Changing the head to point to the next node	
	    head = node.next;   
	    return;
	  }
	       
	 // To find the node at pos-1 
	 for(int i=0; node!=null && i<pos-1; i++)
	   node = node.next;

	 if(node == null || node.next == null)
	  return;
	 
	 // To link the previous node to to node after the deleted node
	 Node next = node.next.next;
	 // Delete the node at given position
	 node.next = next;  
  }
	 
 Node reverse(Node node) 
  {
    Node previous = null; // To keep track of the previous node
	Node current = node; // For the current node
	Node next = null; // For the next node
	while(current != null) 
	 {
	   next = current.next; // Saving the address of the next node
	   current.next = previous; // current now points to the previous node
	   previous = current; // Now shifting the 'previous' node to 'current' node 
	   current = next; // Shifting the ,Current' node to 'next' node 
	 }
	node = previous; // Head point to address in previous that is the start of the reversed list
	return node;
  } 
	    
 Node reverseRecursive(Node current, Node previous)
  {
	// Mark the last node as head
	if(current.next == null)
	 {
	   head = current;
	   // Current points to previous node 
	   current.next = previous;
	   return null;
	 }
	 
	// Save next node for the recursive call 
    Node node1 = current.next;
	 
	//Current points to previous
	current.next = previous;
	 
	reverseRecursive(node1, current);
	return head;
  }
	 
 void printReverse(Node head)
  {
	if(head == null)
	 return;
	 
	// Keep passing the next link to the function
	printReverse(head.next);
	 
	// After recursion is complete, it prints the data of the last node first all the way to the first node
	System.out.print(head.data+" ");
  }
		
 public void print(Node head)
  {
    while(head != null)
     {
	   // Keep printing till we reach null
	   System.out.print(head.data+" ");
	   head = head.next;
	 }
  }
}
