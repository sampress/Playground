
public class Driver {

 public static void main(String[] args)
  {
    // Object for the Interface	 
    ISort s = new bubbleSort();
    //ISort s = new insertionSort();
    //ISort s = new selectionSort();
		
    int a[] = {15, 116, 2, 3, 18};
    s.Sort(a);
	s.printArray(a);
	
  }
}
