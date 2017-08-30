public class Stack
{
  static Node top = null;
  
 //To check if the stack is empty 
 public boolean isEmpty()
   {
     if(top == null)
       return true;
       
     else
         return false;
   }
 
 //For insertion
 public void push(int x)
  {
    if(isEmpty() == true)
     {
       Node ptr = new Node(x); // Creating a new not to be put on the top of the stack
       top = ptr; // Making the top pointer point to the new node
     }
       
    else
     {
       Node ptr = new Node(x);
       ptr.next = top; // Linking the new node to the next node
      top = ptr; // Making the top pointer point to the new node that is on the top of the stack
     }
   }
 
 public int pop()
  {
   if(isEmpty() == true)
     {
       System.out.println("Stack is empty");
       return -1;
     }
    else
      {
        int x = top.data; // Storing the value of the top node
        top = top.next; // Top points to the next node in the stack
        return x;
      }
  }
   

 
 public void display()
  {
    if(isEmpty() == true)
     {
       System.out.println("Stack is empty");
     }
     else
       {
         Node current = top;
         while(current != null)
          {
            System.out.println(current.data);
            current = current.next;
          }
       }
  }
}

