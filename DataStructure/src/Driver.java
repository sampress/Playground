
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

   BinarySearchTree tree = new BinarySearchTree();
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
   
   Graph g = new Graph(4);
   
   g.addEdge(0, 1);
   g.addEdge(0, 2);
   g.addEdge(1, 2);
   g.addEdge(2, 0);
   g.addEdge(2, 3);
   g.addEdge(3, 3);

   System.out.println("\nBFS : ");

   g.BFS(2);
   System.out.println("\nDFS : ");

   g.DFS(2);
   
   System.out.println("\nTopological Sort : ");
   g.topologicalSort();
  
   if(g.D(3,3))
		System.out.println("\nThis graph  a cycle"); 
	    else
	     System.out.println("\nThis graph does   a cycle");
   
   if(g.isCyclicDirected())
		System.out.println("\nThis graph contains a cycle"); 
	    else
	     System.out.println("\nThis graph does not contain a cycle");
   
   
   // Create a graph given in the above diagram
   Graph g3 = new Graph(4);
   g.addEdge(0, 1);
   g.addEdge(0, 2);
   g.addEdge(1, 2);
   g.addEdge(2, 0);
   g.addEdge(2, 3);
   g.addEdge(3, 3);

   if(g3.isCyclicUndirected())
       System.out.println("Graph contains cycle");
   else
	   System.out.println("Graph doesn't contain cycle");
  
   /*Graph g1 = new Graph(5);
   g1.addEdgeUndirected(1, 0);
   g1.addEdgeUndirected(0, 2);
   g1.addEdgeUndirected(2, 0);
   g1.addEdgeUndirected(0, 3);
   g1.addEdgeUndirected(3, 4);
   if (g1.isCyclicUndirected())
       System.out.println("Graph contains cycle");
   else
       System.out.println("Graph doesn't contains cycle");
  
   Graph g2 = new Graph(3);
   g2.addEdgeUndirected(0, 1);
   g2.addEdgeUndirected(1, 2);
   if (g2.isCyclicUndirected())
       System.out.println("Graph contains cycle");
   else
       System.out.println("Graph doesn't contains cycle");*/
   
   
 }
}
