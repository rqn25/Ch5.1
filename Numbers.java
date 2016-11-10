
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
	output(h(input()));
	output(f(input()));
	output(g(input()));
	
	double x2 = Math.random();
	double y2 = Math.random();
	System.out.println("Random number one: " + x2);
	System.out.println("Random number two: " + y2);
	
	System.out.println("Highest number: " + Math.max(x2, y2));
	System.out.println("Lowest number: " + Math.min(x2, y2));
	
	double x3 = 123.456;
	System.out.println("Rounded number (123.456): " + Math.round(x3));
	
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
		return x*x*x*x*x*x*x*x*x*x;
		
	}

	public static int f(int x) {
		int y = input2();
		return x+y;

	}

	public static int g(int x) {
		java.lang.Math.sqrt(x);
		
		int y = input3();
		java.lang.Math.abs(y);
		
		int z = input4();
		java.lang.Math.pow(z, y);
		
		return (int) (java.lang.Math.sqrt(x) + java.lang.Math.abs(y) + java.lang.Math.pow(z, y));
		   
	}
	
}
