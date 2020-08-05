/*Udemy - Data Structures and Algorigthms:Deep dive using JAVA
 * Mridul Mahajan*/
package sort;

//Implementation of Shell sort
public class ShellSort {
public static void main(String[] args) {
	/* Same as insertion sort but with better approach
	 * Complexity - O(n^2), but can be better than insertion sort
	 * Uses gap value
	 * Unstable algorithm
	 * In-place sorting
	 * General formula to calculate gap is (3^k - 1)/2*/
	
	int[] arr = {-10,5,5,3,-50};
	
	//shell sort
	for(int gap = arr.length/2; gap>0; gap=gap/2) {
		for(int i=gap; i<arr.length; i++) {
			int newElement = arr[i];
			int j=i;
			while(j>=gap && arr[j-gap]>newElement) {
				arr[j] = arr[j-gap];
				j-=gap;
			}
			arr[j] = newElement;
		}
	}
	
	//print sorted array
	System.out.println("Sorted array(Shell sort) is:");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}
}