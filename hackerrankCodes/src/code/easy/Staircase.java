package code.easy;

import java.util.Scanner;

public class Staircase {
	static void staircase2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
				System.out.print("#");
			System.out.println();
		}
	}

	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j > n)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase2(n);

		scanner.close();
	}
}
