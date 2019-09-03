package com.web.lotto.serviceImpl;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
	String result = "";
	int[] arr = new int[6];
	for(int i=0; i<arr.length;i++) {
		int a = new Random().nextInt(10)+1;
		arr[i] = a;
	}
	for(int i=0;i<arr.length;i++) {
		result += (i==5) ? arr[i] : arr[i] +",";
	}
	System.out.println(result);
		
		
		
		
		
		
		
	}	
	}


