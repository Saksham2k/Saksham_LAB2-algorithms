package com.greatLearning.main;

import java.util.Scanner;

public class FindTargetTransactions {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number of transactions per day");
		int size = sc.nextInt();
		int[] transactionsArray = new int[size];
		System.out.println("Enter the transactions now");
		for(int index = 0; index < size;) {
			int transaction = sc.nextInt();
			if(transaction > 0) {
				transactionsArray[index] = transaction;
				index++;
			} 
		}
		System.out.println("Enter the number of targets=");
		int noOfTargets = sc.nextInt();
		printNumberOfTransactions(transactionsArray, noOfTargets);
		sc.close();
	}
	
	private static void printNumberOfTransactions(int[] transactionsArray, int noOfTargets) {
		while(noOfTargets > 0) {
			int transactionsCount = getNoOfTransactions(transactionsArray, noOfTargets);
			noOfTargets--;
			if(transactionsCount == -1) {
				System.out.println("Daily target is not achieved by all the transactions");
			}else {
				System.out.println("The number of transactions at which daily target is achieved is="+transactionsCount);
			}
		}
	}
	
	private static int getNoOfTransactions(int[] transactionsArray, int noOfTargets) {
		System.out.println("Enter the daily target =");
		int target = sc.nextInt();
		int transactionsCount = 0;
		int sum = 0;
		do {
			sum = sum + transactionsArray[transactionsCount];
			transactionsCount++;
		}while(sum <= target && transactionsCount < transactionsArray.length);
		
		if(transactionsCount >= transactionsArray.length) {
			return -1;
		}
		return transactionsCount;
	}
}
