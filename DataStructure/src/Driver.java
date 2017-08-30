
public class Driver {

 // Driver Program to test above functions
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
			 
   Stack s = new Stack();
   s.push(4);
   s.push(3);
   s.push(2);
   s.push(1);
   System.out.println("The stack created is:");
   s.display();
   s.pop();
   System.out.println("The stack after poping is:");
   s.display();
				
   Queue q=new Queue();
   q.enqueue(1);
   q.enqueue(3);
   q.dequeue();
   q.enqueue(2);
   System.out.println("Dequeued item is "+ q.dequeue().data);

   binarySearchTree tree = new binarySearchTree();
   tree.insert(2);
   tree.insert(7);
   tree.insert( 9);
   tree.insert(1);
   tree.insert(73);
   tree.insert(61);
   tree.insert(64);
		    
   // print traversal of the BST
   System.out.println("Displaying Inorder : ");
   tree.traverseInorder();
   System.out.println("\nDisplaying in Postorder : ");
   tree.traversePostorder();
   System.out.println("\nDisplaying in Preorder : ");
   tree.traversePreorder();
 }
}
