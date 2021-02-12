package com.secondHasfirst;
//Author Tatek Ahmed
//This program will read strings from the file and
//will check the first string apper at the second
//string. the two string are located in new line in the file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondHasFirst {
	
		public static void main(String[] args) throws FileNotFoundException  {

		File readingString = new File("E:\\twoString.txt");

		Scanner inString = new Scanner(readingString);

		List<String> str = new ArrayList<String>();

		while (inString.hasNextLine()) {
			int i = 0;
			String[] data = inString.nextLine().split(",");
			str.add(data[i]);
			i++;
		}
			inString.close();
			hasString(str);	
		}

private static void hasString(List<String> text) {
		
		String str1 = null;
		String str2 = null;

		// First break the string
		for (int i = 0; i < text.size(); i++) {
			if (i == 0)
				str1 = text.get(i);// first string
			else
				str2 = text.get(i);// second string
		}
		
		// break down the second string
		String[] s = str2.trim().split(" ");

		// if the first string has second squance of character
		for (int j = 0; j < s.length; j++) {
			if (str1.contains(s[j]))
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}
