package com.home.DataProcess;

public class ADImpressionSimulator {

    public int[] numbers = new int[] {1,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,19,20}; 
	/*
	 * Performs Binary Search to quickly find the correct position of advertisement.
	 */
    public int performSearch(int[] num, int key, int low, int high) {
		if (num.length == 0) {
			System.out.println("Array empty");
			return -1;
		} else if ((key < num[0]) || (key > num[num.length - 1])) {
			System.out.println("Number not in bounds of array.");
			return -1;
		} else if (low <= high) {

			int mid;
			mid = (low + high) / 2;
			if (key < num[mid]) {
				high = mid - 1;
				return performSearch(num, key, low, high);
			} else if (key > num[mid]) {
				low = mid + 1;
				return performSearch(num, key, low, high);
			} else {

				System.out.println("Found the number in the array at index: "
						+ mid);
				return mid;
			}
		} else {
			System.out.println("Number not in array.");
			return -1;
			// return number;
		}

	}
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 14;
		ADImpressionSimulator bs = new ADImpressionSimulator();
        int low = 0;
        int high = bs.numbers.length;
        bs.performSearch(bs.numbers, key, low, high); 
	}

	
}
