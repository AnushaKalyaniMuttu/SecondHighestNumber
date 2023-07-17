package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main (String [] args) {
	
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,7));
		/*
		 * • Write program to find the second highest number • 
		 */
		
		//Second Highest number
	Integer secondHighest=	list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(secondHighest);
	
	
	}
}
