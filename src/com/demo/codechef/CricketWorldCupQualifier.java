package com.demo.codechef;

import java.util.Scanner;

public class CricketWorldCupQualifier {
	
	public static String isQualified(int num) {
		if(num>=12) {
			return "Yes";
		}
		return "No";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isQualified(num));
		
		
	}

}
