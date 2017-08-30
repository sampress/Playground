
public class Driver {

 public static void main(String[] args) 
  {
	Queue q=new Queue();
	q.enqueue(1);
	q.enqueue(3);
	q.dequeue();
	q.enqueue(2);
	    
    System.out.println("Dequeued item is "+ q.dequeue().data);
   }
}
