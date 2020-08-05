/*Udemy - Data Structures and Algorigthms:Deep dive using JAVA
 * Mridul Mahajan*/
package sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] input = {9,8,7,6,-5,-6,-3,-1};
		
		quickSort(input, 0, input.length);
		
		//print sorted array
		System.out.println("Sorted array(Merge sort) is:");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	private static void quickSort(int[] input, int start, int end) {
		if(end-start < 2)
			return;
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}
	
	private static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while(i<j) {
			while(i<j && input[--j]>=pivot);
			if(i<j) {
				input[i] = input[j];
			}
			
			while(i<j && input[++i]<=pivot);
			input[j] = input[i];
		}
		
		input[j] = pivot;
		return j;
	}
}
