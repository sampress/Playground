class Queue
{
 Node front = null;
 Node rear = null;
 
 public boolean isEmpty()
 {
   if(front == null && rear == null)
     return true;
     
   else
       return false;
 }
 
 void enqueue(int data)
 {  
   // Create a new node
   Node node = new Node(data);
   
   // If queue is empty, front and rear point to the new node
   if(front == null && rear == null)
    {
      front = rear = node;
      return;
    }
   
   // Add the new node at the end of queue and rear now points to the new node
   rear.next = node;
   rear = node;
 }
   
Node dequeue()
 {
   // If queue is empty, return NULL.
   if(front == null)
     return null;
   
   // Storing the previous front so we can shift it
   Node node = front;
   front = front.next; // Shifting the front to the next node
   
   // If front becomes NULL, then change rear also as NULL
   if(front == null)
   {
	 rear = null;
   }
     
   return node;
 }

public void display()
{
  if(isEmpty() == true)
   {
     System.out.println("Queue is empty");
   }
   else
     {
       Node current = front;
       while(current != null)
        {
          System.out.println(current.data);
          current = current.next;
        }
     }
}
}


