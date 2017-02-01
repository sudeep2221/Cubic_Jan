package com.cubic.assignments;

import java.io.InputStream;
import java.util.Scanner;

public class Parenthesisre {
	
	

	static String paren[] = { "(", ")", "{", "}", "[", "]" };

	static int lcount, i, rcount, mlcount, mrcount, llcount, lrcount;

	static int re(String x, int b) {

	//	System.out.println(x.substring(b - 1, (b)));

		if (x.substring(b - 1, b).equals(paren[0]))
			lcount++;
		else if (x.substring(b - 1, b).equals(paren[1]))
			rcount++;

		else if (x.substring(b - 1, b).equals(paren[2]))
			mlcount++;
		else if (x.substring(b - 1, b).equals(paren[3]))
			mrcount++;
		else if (x.substring(b - 1, b).equals(paren[4]))
			llcount++;
		else if (x.substring(b - 1, b).equals(paren[5]))
			lrcount++;

			if (lcount < rcount || mlcount < mrcount || llcount < lrcount) {
			System.out.println("............................................................................");
			System.out.println("The input parenthesis is FALSE");

			System.exit(0);
		}
			
			

		if (b == x.length())

			return b;

		else

			return re(x, b + 1);

	}

	public static void main(String[] args) {

		
		System.out.println("Please enter the parenthesis ............................");

	
		Scanner n = new Scanner(System.in);

		re(n.nextLine(), 1);


		System.out.println("............................................................................");

		if (lcount == rcount && mlcount == mrcount && llcount == lrcount) {
			System.out.println("The input parenthesis is TRUE");
		} else {
			System.out.println("The input parenthesis is FALSE");
		}

	}

	private static Scanner Scanner(InputStream in) {

		return null;
	}

}
