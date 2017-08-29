
public class Driver {

 public static void main(String args[])
  {
	ISearch bs = new binarySearch();
	int[] array = {1, 7, 9, 21};
	int x = 9;
	int searchResult = bs.Search(array, x);
	     
	if(searchResult == -1)
	  System.out.println("Element not present");
	  
	  else
	    System.out.println("Element found at index "+searchResult);
  }
}
