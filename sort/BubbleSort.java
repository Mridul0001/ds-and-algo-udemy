/*Udemy - Data Structures and Algorigthms:Deep dive using JAVA
 * Mridul Mahajan*/
package sort;
import java.util.Scanner;

//implementation of Bubble sort
public class BubbleSort {
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
	 * Bubble sort has complexity of O(n^2)
	 * If we sort from left to right, largest element will be at last index after
	 * first run and so on
	 * It is an in-place sorting algorithm and is stable*/
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n-1-i; j++) {
			if(arr[j]>arr[j+1]) { //not in sorted order
				//swap the two elements
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	//print sorted array
	System.out.println("Sorted array(Bubble sort) is:");
	for(int i=0; i<n; i++) {
		System.out.print(arr[i] + " ");
	}
}
}
