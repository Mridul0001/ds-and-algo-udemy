/*Udemy - Data Structures and Algorigthms:Deep dive using JAVA
 * Mridul Mahajan*/
package sort;

//Implementation of Insertion sort
public class InsertionSort {
public static void main(String[] args) {
	/*Complexity-O(n^2)
	 * in-place sorting
	 * Stable sorting algorithm
	 * sorting begins from starting*/
	
	int[] arr = {-15,10,85,16,-5,-5};
	
	for(int firstUnsortedIndex=1; firstUnsortedIndex<arr.length; firstUnsortedIndex++) {
		int newElement = arr[firstUnsortedIndex];
		int i;
		for(i=firstUnsortedIndex; i>0 && arr[i-1]>newElement; i--) {
			arr[i] = arr[i-1];
		}
		arr[i] = newElement;
	}
	
	//print sorted array
		System.out.println("Sorted array(Selection sort) is:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
}
}
