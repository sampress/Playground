
public class Driver {
	public static void main(String[] args)
	  {
	    // Object for the Interface	 
	    ISort s = new BubbleSort();
	    //ISort s = new InsertionSort();
	    //ISort s = new SelectionSort();
			
	    int a[] = {15, 116, 2, 3, 18};
	    s.Sort(a);
		s.printArray(a);
		
		ISearch bs = new BinarySearch();
		int[] array = {1, 7, 9, 21};
		int x = 9;
		int searchResult = bs.Search(array, x);
		     
		if(searchResult == -1)
		  System.out.println("Element not present");
		  
		  else
		    System.out.println("Element found at index "+searchResult);
		
	  }

}
