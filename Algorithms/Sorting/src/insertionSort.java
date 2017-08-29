
public class insertionSort implements ISort {

 public void Sort(int[] array)
  {
	for(int i = 1; i < array.length; i++)
	  {
		int currentElement = array[i];
	    int j = i - 1;
		   
	    // Comparing current element to find its correct position and shift the rest
	    while(j >= 0 && array[j] > currentElement)
		 {
		   array[j+1] = array[j];
		   j = j-1;
		 }
		   
	    array[j+1] = currentElement;
      }
  }

 public void printArray(int[] array)
  {
    for(int i=0; i<array.length; ++i)
	  {
	    System.out.print(array[i] + " ");
	  }
	     
     System.out.println();

  }
}
