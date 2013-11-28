package com.home.DataProcess;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetDistinctAppearCount {

		public static List<Integer> CountList = new ArrayList<Integer>();
		public static HashMap<String, Integer> User_Count_Map = new HashMap<String, Integer>();
	
		public static void ReadFile() throws Exception
		{
				String input = "";
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
					
				}
		}
}

