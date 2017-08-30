
public class Driver {

	// Driver Program to test above functions
	 public static void main(String[] args) {

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
