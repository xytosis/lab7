package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		int temp;
       		for(int i=0; i < arr.length-1; i++){
 
                   for(int j=1; j < arr.length-i; j++){
        	      if(arr[j-1] > arr[j]){
       		            temp=arr[j-1];
        	            arr[j-1] = arr[j];
        	            arr[j] = temp;
                      }
                   }
        	}
        	return arr;
    	}
}
