package code.easy;

import java.util.Scanner;

public class SolveMeFirst {
	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		int num=a+b;
		return num;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
		in.close();
	}

}
