package com.currency.util;

public class NotesCounter {
	public int amountPay,counter;
	public int [] arrOfSortedDenomination;
	
	public NotesCounter(int amountPay, int [] arrOfSortedDenomination){
		this.amountPay = amountPay;
		this.arrOfSortedDenomination = arrOfSortedDenomination;
	}
	
	public void getCountOfNotes() {
		int [] finalResult = new int[arrOfSortedDenomination.length];
		for(int i = 0;i<arrOfSortedDenomination.length;i++) {
			int cNotes = amountPay/arrOfSortedDenomination[i];
			amountPay = amountPay - (cNotes * arrOfSortedDenomination[i]);
			finalResult[i] = cNotes;
		}
		
		if(amountPay > 0) {
			System.out.println("\nAmount to Pay is higher than the denomination");
		}else {
			System.out.println("\nYour payment approach in order to give min no of notes will be");
			for(int j=0;j<finalResult.length;j++) {
				if(finalResult[j] !=0) {
					System.out.println(arrOfSortedDenomination[j]+":"+finalResult[j]);
				}
			}
		}
	}
	
}
