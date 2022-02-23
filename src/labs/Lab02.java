package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a Positive Integer: ");
		int num1 = inKey.nextInt();
		System.out.println("Enter another Positive Integer: ");
		int num2 = inKey.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		int scope =  max -min+1;
		
		
		// Random number from 13 to 28
				//scope = max - min + 1
				//scope = 28 - 13 + 1;
				//min = 13;

		for (int i = 0; i < 10; i++) {
			int Random = (int) (Math.random() * scope + min);
			System.out.println(Random + " ");
		}	
		
		
	}
	
	
	
	
	public static void problem02() {
	Scanner inKey =  new Scanner(System.in);
	System.out.println("Enter the Radius of a cylinder: ");
	int R   = inKey.nextInt();
	System.out.println("Enter the Height of a cylinder: ");
	int H   = inKey.nextInt();
	
	double V  =   (H*Math.pow(R, 2)*Math.PI);
	System.out.println(V);
		
	}

	
	

	public static void problem03() {
		Scanner inKey =  new Scanner(System.in);
		System.out.println(" Enter a number for X1: ");
		double x1 = inKey.nextDouble();
		// Y1
		System.out.println(" Enter a number for Y1: ");
		double y1 = inKey.nextDouble();
		// X2
		System.out.println(" Enter a number for X2: ");
		double x2 = inKey.nextDouble();
		//Y2
		System.out.println(" Enter a number for Y2: ");
		double y2 = inKey.nextDouble();
		
		
		double ans = Math.sqrt(Math.pow(y2- y1, 2) + Math.pow(x2-x1,2));
		
		System.out.println(ans);
	}


	
	
	public static void problem04() {
		
		Scanner inKey =  new Scanner(System.in);
		System.out.print("Ennter a-value: ");
		double a = inKey.nextDouble();
		System.out.println();
		System.out.print("Ennter b-value: ");
		double b = inKey.nextDouble();
		System.out.println();
		System.out.print("Ennter c-value: ");
		double c = inKey.nextDouble();
		System.out.println();
		double x1, x2;
		double b2 = Math.pow(b, 2);
		double sqrt = Math.sqrt(b2 - 4* a * c);
		x1 = (-b + sqrt)/(2*a);
		x2 = (-b - sqrt)/(2*a);
		System.out.println(x1 =+ x1);
		System.out.println(x2 =+  x2);
	}
	
	

	
}
