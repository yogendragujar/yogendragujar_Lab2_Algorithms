package com.currency.main;

import java.util.Scanner;

import com.currency.util.NotesCounter;
import com.currency.util.SortDenominationsDescending;

public class EvaluateDenominationMain {
	public static int sizeOfDenominations, amountToPay,result = 0;
	public static int [] arrOfDenominations, arrOfSortedDenomination;
	static Scanner input = new Scanner(System.in);
	
	static void insertValues(){
		for(int i=0;i<sizeOfDenominations;i++) {
			System.out.println("Enter the currency denominations value "+i);
			arrOfDenominations[i] = input.nextInt();
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations");
		sizeOfDenominations  = input.nextInt();
		arrOfDenominations = new int[sizeOfDenominations];
		insertValues();
		
		System.out.println("Enter the amount you want to pay");
		amountToPay = input.nextInt();
		
		SortDenominationsDescending sortToDescending = new SortDenominationsDescending();
		arrOfSortedDenomination = sortToDescending.sortArray(arrOfDenominations, 0, sizeOfDenominations-1);
		
		NotesCounter ncounter = new NotesCounter(amountToPay,arrOfSortedDenomination);
		ncounter.getCountOfNotes();
		
	}

}
