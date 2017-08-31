

public class binarySearchTree {

 treeNode root = null;
 public void insert(int data)
    {
        root = Insert(root, data);
    }
 	
 
 public treeNode Insert(treeNode root, int data)
 {
   // If the tree is empty 
   if(root == null)
   {
	   root = new treeNode(data);
   }
   // Condition to enter in the left subtree 
   else if(data <= root.data)
	{
	  root.left = Insert(root.left, data);
	}
	// Condition to enter in the right subtree 
    else
    {
  	  root.right = Insert(root.right, data);
    }
   return root;
 }
 
 public void search(int data)
 {
   Search(root, data);
 }
 
 public treeNode Search(treeNode root, int data)
 {
     // If the root is empty or the searched data is at root
     if (root == null || root.data == data)
         return root;
  
     // If the data is greater than root value 
     if (root.data > data)
         return Search(root.left, data);
  
     // If the data is less than root value
     return Search(root.right, data);
 }
 

 
/* public void levelOrder(Node root)
 {
	 if(root == null)
		 return;
	 Queue q = new LinkedList();
	 q.add(root);
	 while(!q.isEmpty())
	 {
		 Node current = q.front;
	 }
	 
 }*/
 
 public int height(treeNode root)
 {
   if(root == null)
    return 0;
    else
     {
       // Finding the height of left and right subtree 
       int leftSubtree = height(root.left);
       int rightSubtree = height(root.right);
          
       if(leftSubtree > rightSubtree)
        return(leftSubtree+1);
         
        else 
          return(rightSubtree+1); 
      }
 }
 
 // Traversing the tree from Root, Left the Right
 public void Preorder(treeNode node)
 {
  if(node == null)
   return;

  // Print the data
  System.out.print(node.data + " ");

  // Recursion on the left subtree
  Preorder(node.left);

  // Recursion on the right subtree
  Preorder(node.right);
 }
 
 // Traversing in order Left, Right and  then Data  
 public void Postorder(treeNode node)
 {
   if(node == null)
    return;

   // Recursion on the left subtree
   Postorder(node.left);

   // Recursion on the right subtree
   Postorder(node.right);

   // Print the data
   System.out.print(node.data + " ");
 }

 // Traversing the tree in a sorted manner
 public void Inorder(treeNode node)
 {
  if(node == null)
   return;

  // Recursion on the left child
  Inorder(node.left);

  // Print the data
  System.out.print(node.data + " ");

  // Recursion on the right child
  Inorder(node.right);
 }

 public void traversePreorder() 
  { Preorder(root);}
 
 public void traversePostorder()  
  { Postorder(root);}
 
 public void traverseInorder() 
  { Inorder(root);}
 
 
 
 public boolean binarySearchTreeUtil(treeNode root, int minValue, int maxValue)
 {
   if(root == null)
     return true;
	 
   /* minValue and maxValue set the range of values the node of each subtree can take 
    for it to still be a BST.
    The left subtree can have the range of (minValue, value of parent node)
    The right subtree can have the range of (value of parent node, right)
    */
   if(root.data < minValue && root.data > maxValue 
		   && binarySearchTreeUtil(root.left, minValue, root.data) 
		   && binarySearchTreeUtil(root.right, root.data, maxValue))
	return true;
	else 
	 return false;
 }
 
 public boolean isBinarySearchTree()
 {
   // MIN_VALE and MAX_VALUE is the range of the values the node can take (2^-31, 2^31)	 
   return binarySearchTreeUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
 }
 
 public void delete(int data)
 {
   root = Delete(root, data);
 }
 
 public treeNode Delete(treeNode root, int data)
 {
   if(root == null) 
    return root;
	 
   // Node in let subtree
   else if(data < root.data)
	 root.left = Delete(root.left, data);
   // Node in right subtree
   else if(data > root.data)
	root.right = Delete(root.right, data);
	 
   // Node found
	else
	 {
	   // Case when there is no child
	   if(root.left == null && root.right == null)
		{
		  // Simply make the node null
		  root = null;
		}
	   // Case with one child
	   else if(root.left == null)
		{ 
		  // Link the previous node to the right subtree of the target node 
		  root = root.right;
		}
	   else if(root.right == null)
		{
		  // Link the previous to the left subtree of the target node 
		  root = root.left;
		}
	   
	    // Case with 2 children
		else 
		 {	 
		   // Find the minimum value in the right subtree of the node being deleted and replace the node value
		   root.data = findMin(root.right);
		   // Delete the minimum value node to remove the copy 
		   root.right = Delete(root.right, root.data);
		 }
	  }
	return root;
 }
 
 int findMin(treeNode root)
 {
     int minv = root.data;
     while (root.left != null)
     {
         minv = root.left.data;
         root = root.left;
     }
     return minv;
 }
 
}
