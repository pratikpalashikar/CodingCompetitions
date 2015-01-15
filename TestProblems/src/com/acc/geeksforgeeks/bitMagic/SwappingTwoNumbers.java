package com.acc.geeksforgeeks.bitMagic;

import java.util.Scanner;

/**
 * The bitwise XOR operator can be used to swap two variables. The XOR of two
 * numbers x and y returns a number which has all the bits as 1 wherever bits of
 * x and y differ. For example XOR of 10 (In Binary 1010) and 5 (In Binary 0101)
 * is 1111 and XOR of 7 (0111) and 5 (0101) is (0010).
 * 
 * @author RAHUL
 * 
 */
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("a=" + a + ", b=" + b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a=" + a + ", b=" + b);
		
		
	}

}
