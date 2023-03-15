package com.tnsif.multiplecatch;

import java.util.Scanner;

public class Division

{
	public static void divide() {
		int a, b, c;
		int arr[] = { 20, 40, 60 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers");

		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Result is:" + c);
			System.out.println(arr[c]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("Error Occured...." + ae.getMessage());
		}

		catch (Exception e) {
			System.out.println("Error Occured once again...." + e.getMessage());
		}
	}

}
