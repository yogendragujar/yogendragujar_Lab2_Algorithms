package com.currency.util;

public class SortDenominationsDescending {
	public int[] sortArray(int array[], int left, int right){
		int [] retArray = new int[array.length];
		if (left < right) {
			int mid = left + (right - left) / 2;
			sortArray(array, left, mid);
			sortArray(array, mid + 1, right);
			retArray = conquerArray(array, left, mid, right);
		}
		return retArray;
	}
	
	public int[] conquerArray(int array[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for (int i = 0;i < n1; ++i) {
			leftArray[i] = array[left + i];
		}
		
		for (int j = 0; j < n2; ++j) {
			rightArray[j] = array[mid + 1 + j];
		}
		
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
				k++;
		}
		
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
		return array;
	}
}
