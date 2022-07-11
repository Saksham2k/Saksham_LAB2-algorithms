package com.greatLearning.sort;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[] {4,5,6,1,2,3};
		System.out.println("Elements before sorting");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); 
		}
		System.out.println();
		mergeSort(array, 0 , array.length - 1);
		System.out.println("Elements after sorting");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); 
		}
	}

	public static void mergeSort(int[] array, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	private static void merge(int[] array, int left, int mid, int right) {
		 
		int sizeOfLeftArray = mid - left + 1;
		int sizeOfRightArray = right - mid;
		
		int[] leftArray = new int[sizeOfLeftArray];
		int[] rightArray = new int[sizeOfRightArray];
		
		for(int index = 0; index < sizeOfLeftArray; index++) {
			leftArray[index] = array[left+index];
		}
		
		for(int index = 0; index < sizeOfRightArray; index++) {
			rightArray[index] = array[mid + index + 1];
		}
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while(i < sizeOfLeftArray && j < sizeOfRightArray) {
			if(leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < sizeOfLeftArray) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < sizeOfRightArray){
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
