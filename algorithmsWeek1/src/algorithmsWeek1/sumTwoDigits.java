package algorithmsWeek1;

import java.util.Scanner;

public class sumTwoDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		
		System.out.println(a+b);
	}
}
