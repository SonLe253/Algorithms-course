package algorithmsWeek2;

import java.util.Scanner;

public class Driver {
	public static long calcFib(int n) {
		long[] num= new long [45];
		num[0] = 0;
		num[1] = 1;
		
		switch(n)
		{
			case 0:
				return 0;
			case 1: 
				return 1;
			default:
				for(int i=2; i<=n; i++) {
					num[i] = num[i-1] + num[i-2];
				}
				return num[n];
		}
	}
	
	public static int lastDigitFib(int n) {
		long[] fib = new long [10000000];
		fib[0] = 0;
		fib[1] = 1;
		
		switch(n)
		{
			case 0:
				return 0;
			case 1:
				return 1;
			default: 
				for(int i=2; i<=n; i++) {
					fib[i] = (fib[i-1] + fib[i-2]) % 10;
				}
				return (int) fib[n];
		}
	}
	
	public static long GCD(long a, long b) {
		long larger, smaller, temp;
		
		if (a>b) {
			larger = a;
			smaller = b;
		}
		else if (b>a) {
			larger = b;
			smaller = a;
		}
		else{
			return a;
		}
		
		while(smaller!=0) {
			temp = larger;
			larger = smaller;
			smaller = temp%smaller;
		}
		
		return larger;
	}
	
	public static long LCM(long a, long b) {
		long gcd = GCD(a,b);
		return (a*b)/gcd;
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\nPress 0 to terminate the program.");
			System.out.print("Enter a number of problem: ");
			Scanner in = new Scanner(System.in);
			int prob = in.nextInt();
			int input, input2;
		
			switch(prob)
			{
				case 1:
					System.out.println("\nProblem #1");
					System.out.println("Calculate the n-th number in the Fibonacci sequence.");
					System.out.print("Please enter a number: ");
					input = in.nextInt();
					System.out.println("Result: " + calcFib(input));
					break;
				
				case 2:
					System.out.println("\nProblem #2");
					System.out.println("Calculate the last digit of n-th number in the Fibonacci sequence.");
					System.out.print("Please enter a number: ");
					input = in.nextInt();
					System.out.println("Result: " + lastDigitFib(input));
					break;
				
				case 3: 
					System.out.println("\nProblem #3");
					System.out.println("Calculate the greatest common divisor of two number.");
					System.out.print("Please enter two number: ");
					input = in.nextInt();
					input2 = in.nextInt();
					System.out.println("Result: " + GCD(input,input2));
					break;
			
				case 4: 
					System.out.println("\nProblem #4");
					System.out.println("Calculate the least common multiple of two number.");
					System.out.print("Please enter two number: ");
					input = in.nextInt();
					input2 = in.nextInt();
					System.out.println("Result: " + LCM(input,input2));
					break;
				
				case 0:
					in.close();
					System.exit(0);
					
				default:
					System.out.println("Invalid input.");
					break;
			}
		}
	}
}
