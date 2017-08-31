
public class BinarySearch implements ISearch {

 public int Search(int[] array, int x)
  {
	int start = 0, end = array.length - 1;
	        
	while(start <= end)
	 {
	   int mid = start + (end-start)/2;
	 
	   // Check if x is at the mid position
	   if(array[mid] == x)
	    return mid;
	 
	   // If x greater
	   if(array[mid] < x)
	    start = mid + 1;
	 
	   // If x is smaller
	    else
	     end = mid - 1;
	  }
	 
	  //Element was not present
	  return -1;
	    
  }
}
