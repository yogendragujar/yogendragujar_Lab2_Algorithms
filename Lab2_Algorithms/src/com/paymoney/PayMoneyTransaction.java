package com.paymoney;

import java.util.Scanner;

public class PayMoneyTransaction {
	public static int sizeOfTransaction, numOfTarget,valueToAchieve,result = 0;
	public static int [] arrOfTransactions;
	public static boolean flag = false;
	static Scanner input = new Scanner(System.in);
	
	static void insertValues(){
		for(int i=0;i<sizeOfTransaction;i++) {
			System.out.println("Enter the values of array "+i);
			arrOfTransactions[i] = input.nextInt();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		sizeOfTransaction = input.nextInt();		//get size
		arrOfTransactions = new int[sizeOfTransaction];
		insertValues();
		System.out.println("Enter the total no of targets that needs to be achieved");
		numOfTarget  = input.nextInt();
		
		for(int i = 0;i<numOfTarget;i++) {
			int count=0;
			System.out.println("Enter the value of target");
			valueToAchieve = input.nextInt();
			int iteration = 0;
			while(iteration < arrOfTransactions.length) {
				int arrValue = arrOfTransactions[iteration];
				if(result >= valueToAchieve) {
					flag = true;
					break;
				}else {
					result = result + arrValue;
					count++;
					
				}
				iteration++;
			}
			
			if(flag) {
				if(count == 0) {
					System.out.println("Target"+(i+1)+" achieved after "+(count+1)+" transactions");
				}else {
					System.out.println("Target"+(i+1)+" achieved after "+count+" transactions");
				}
				
			}else {
				System.out.println("Given target is not achieved ");
			}
		}
		input.close();
	}

}
