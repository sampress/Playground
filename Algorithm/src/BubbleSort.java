
public class BubbleSort implements ISort{
	
 public void Sort(int[] array)
  {
     // Variable to check if the elements are being swapped 
	 boolean swapped = true;
     int i = 0; // Variable to keep track of the number of iterations
		 
	 while(swapped) 
	  {
	    swapped = false;
		i++;
		// Loop to compare the elements and swap them if needed
		for(int j = 0; j < array.length - i; j++) 
		   {                                       
		     if(array[j] > array[j + 1]) 
		       {                          
		         int temp = array[j];
		         array[j] = array[j + 1];
		         array[j + 1] = temp;
		         swapped = true;
		       }
		    }                
	   }
  }
	
 public void printArray(int[] array)
  {
    for(int i=0; i< array.length; ++i)
	   {
	     System.out.print(array[i] + " ");
	   }
	      
	System.out.println();

  }
}