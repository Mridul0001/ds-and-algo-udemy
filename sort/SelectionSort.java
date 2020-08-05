/*Udemy - Data Structures and Algorigthms:Deep dive using JAVA
 * Mridul Mahajan*/
package sort;
import java.util.Scanner;

//implementation of Selection sort
public class SelectionSort {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n; //number of elements to be stored in array
	System.out.println("Enter preffered size of array");
	n=scan.nextInt();
	int arr[] = new int[n]; //declaring array of size n
	System.out.println("Enter elements into array");
	for(int i=0; i<n; i++) {
		arr[i] = scan.nextInt();
	}
	
	/*Sorting array using bubble sort
	 * Selection sort has complexity of O(n^2)
	 * Doesn't need to swap elements at each step, swapping only happens at end of a run
	 * If we sort from left to right, largest element will be at last index after
	 * first run and so on
	 * It is an in-place sorting algorithm and is un-stable*/
	for(int lastUnsortedIndex=n-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
		int largestIndex = 0;
		for(int j=1; j<=lastUnsortedIndex; j++) {
			if(arr[j]>arr[largestIndex]) { //not in sorted order
				//change index of largest element
				largestIndex = j;
			}
		}
		if(largestIndex == lastUnsortedIndex)
			continue;
		int temp = arr[largestIndex];
		arr[largestIndex] = arr[lastUnsortedIndex];
		arr[lastUnsortedIndex] = temp;
	}
	//print sorted array
	System.out.println("Sorted array(Selection sort) is:");
	for(int i=0; i<n; i++) {
		System.out.print(arr[i] + " ");
	}
}
}
