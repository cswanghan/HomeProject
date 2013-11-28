package com.home.DataProcess;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

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
    
    public void FileReader(String file) throws Exception
    {
		String input = file;
		InputStreamReader InputFile = null;
		try {
			InputFile = new InputStreamReader(new FileInputStream(input),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader FileReader = new BufferedReader(InputFile);
		
		String temp = null;
		while((temp = FileReader.readLine()) != null)
		{
			String[] details = temp.split("\t");
			String ad_id = details[0];
			String eCPM = details[1];
			String arrange = details[2];
			System.out.println(temp);
		}
			
    }
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
	//		int key = 14;
	//		ADImpressionSimulator bs = new ADImpressionSimulator();
	//        int low = 0;
	//        int high = bs.numbers.length;
	//        bs.performSearch(bs.numbers, key, low, high); 
		ADImpressionSimulator bs = new ADImpressionSimulator();
		bs.FileReader("externalsrc/SampleAdFile");
	}

	
}
