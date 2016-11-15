
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
	//System.out.println("Math expression one: x^10");
	output(h(input()));
	System.out.println();
	//System.out.println("Math expression two: x + y");
	output(f(input()));
	System.out.println();
	//System.out.println("Math expression three: x^(1/2) + |y| + z^y");
	output(g(input()));
	System.out.println();

	System.out.println("Two power five: " + Math.pow(2, 5));

	System.out.println("Square root four: " + Math.sqrt(4));

	int x4 = -5;
	System.out.println("Absolute number (" + x4 + "): " + Math.abs(x4));
	
	double x2 = Math.random();
	double y2 = Math.random();
	System.out.println("Random number one: " + x2);
	System.out.println("Random number two: " + y2);
	
	System.out.println("Highest number: " + Math.max(x2, y2));
	System.out.println("Lowest number: " + Math.min(x2, y2));
	
	double x3 = 123.456;
	System.out.println("Rounded number (" + x3 + "): " + Math.round(x3));
	
	System.out.println("Math.ceil (" + x3 + "): " + Math.ceil(x3));
	
	System.out.println("Math.floor (" + x3 + "): " + Math.floor(x3));

	}

	public static void output(int x) {
		System.out.println(x);

	}

	public static int input() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for x");
		return keyboard.nextInt();
		
	}
		
	public static int input2() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for y");
		return keyboard.nextInt();
		
	}
	
	public static int input3() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for y");
		return keyboard.nextInt();
		
	}
	
	public static int input4() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number for z");
		return keyboard.nextInt();

	}

	public static int h(int x) {
		//System.out.print(x + "^10 = ");
		return x*x*x*x*x*x*x*x*x*x;
		
	}

	public static int f(int x) {
		int y = input2();
		//System.out.print(x + " + " + y + " = ");
		return x+y;

	}

	public static int g(int x) {
		java.lang.Math.sqrt(x);
		
		int y = input3();
		java.lang.Math.abs(y);
		
		int z = input4();
		java.lang.Math.pow(z, y);
		
		//System.out.print(x + "^(1/2) + |" + y + "| + " + z + "^" + y + " = ");
		return (int) (java.lang.Math.sqrt(x) + java.lang.Math.abs(y) + java.lang.Math.pow(z, y));
		   
	}
	
}
