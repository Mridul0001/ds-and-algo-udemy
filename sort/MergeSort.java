/*Udemy - Data Structures and Algorigthms:Deep dive using JAVA
 * Mridul Mahajan*/
package sort;

//Implementation of merge sort
public class MergeSort {
	public static void main(String[] args) {
		int[] input = {9,8,7,6,-5,-6,-3,-1};
		
		mergeSort(input, 0, input.length);
		
		//print sorted array
		System.out.println("Sorted array(Merge sort) is:");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	private static void mergeSort(int[] input, int start, int end) {
		
		if(end-start <2)
			return;
		
		int mid = (start+end)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}
	
	private static void merge(int[] input, int start, int mid, int end) {
		if(input[mid-1]<=input[mid])
			return;
		int[] temp = new int[end-start];
		int i=start;
		int j=mid;
		int tempIndex = 0;
		
		while(i<mid && j<end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++]:input[j++];
		}
		
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}
}
