package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a Positive Integer:");
		int Num1 = inKey.nextInt();
		System.out.print("Enter another Positive Integer:");
		int Num2 = inKey.nextInt();
		double ans = Math.pow(Num1, Num2);
		System.out.println(Num1+"^"+ Num2+ "="+ ans);
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a Positive Integer:");
		double input =  inKey.nextDouble();
		double ans = Math.sqrt(input);
		System.out.println("The Square Root of "+ input + " is "+ ans);
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Length of side A: ");
		double  A = inKey.nextDouble();
		System.out.print("Length of side B: ");
		double B = inKey.nextDouble();
		double A2 = Math.pow(A,2);
		double B2 = Math.pow(B,2);
		double C  = A2 + B2;
		double C2 = Math.sqrt(C);
		System.out.println(C2);
		

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		boolean zero = true;
		int max = Integer.MIN_VALUE; //Set max a low as possible
		int min = Integer.MAX_VALUE; //Set min a high as possible
		int input = 1;
		while(zero) {
			System.out.println("Enter a  Number");
			 input = inKey.nextInt();
			if(input == 0) {
				zero = false;
			}
			max = Math.max(input, max);
			  min = Math.min(input, min);
		}
		System.out.println("Max = "+ max);
		System.out.println("Min = "+min);
	}
	
	
	
	
	
	
}
