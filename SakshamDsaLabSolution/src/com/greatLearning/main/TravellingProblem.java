package com.greatLearning.main;

import java.util.Scanner;
import com.greatLearning.sort.*;

public class TravellingProblem {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of currency denominations=");
		int noOfDenominations = sc.nextInt();
		System.out.println("Enter the currency denominations=");
		int[] notesArray = new int[noOfDenominations];
		for(int index = 0;index < noOfDenominations; index++) {
			notesArray[index] = sc.nextInt();
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(notesArray,0,notesArray.length-1);
		for(int i=0; i < notesArray.length;i++) {
			System.out.print(notesArray[i]);
			System.out.print(",");
		}
		System.out.println("Enter the target amount=");
		int target = sc.nextInt();
		NotesCounter notesCounter = new NotesCounter();
		int[] notesCounterArray = notesCounter.notesCount(notesArray, target);
		
		for(int index = 0; index < notesArray.length; index++) {
			if(notesCounterArray[index] != 0) {
				System.out.println(notesArray[index]+":"+notesCounterArray[index]);
			}
		}
	}
}
