package com.greatLearning.main;

public class NotesCounter {
	public int[] notesCount(int[] notesArray, int target) {
		int notesCounter[] = new int[notesArray.length];
		for( int i = 0; i<notesArray.length;i++) {
			if(target>=notesArray[i]) {
				notesCounter[i] = target / notesArray[i];
				target = target - notesCounter[i] * notesArray[i];
			}
		}
		if(target > 0) {
			System.out.println("The exact target amount is not reachable with this denominations");
			return new int[notesArray.length];
		}else {
			return notesCounter;
		}
	}
}

