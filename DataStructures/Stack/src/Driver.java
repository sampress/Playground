
public class Driver {
	
 public static void main(String[] args) 
  {
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
  }
}
