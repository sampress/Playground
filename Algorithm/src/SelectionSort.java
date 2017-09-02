
public class SelectionSort implements ISort {

 public void Sort(int[] array)
  {
    int minElement;
		 
    // Iteration through the array
    for(int i = 0; i < array.length - 1; i++)
     {
	   // Finding the minimum element
	   minElement = i;
	   for(int j = i + 1; j < array.length; j++)
		{	 
		  if(array[j] < array[minElement])
	        minElement = j;
	    }  
		
        // Swap the minimum element with the first element of the array
        int temp = array[i];
        array[i] = array[minElement];
        array[minElement] = temp;
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
