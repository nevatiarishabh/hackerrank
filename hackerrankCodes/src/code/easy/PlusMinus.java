package code.easy;

import java.util.Scanner;

public class PlusMinus {
	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int neg = 0, pos = 0, zer = 0;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				neg++;
			else if (arr[i] > 0)
				pos++;
			else if (arr[i] == 0)
				zer++;
		}
		double nega = (double) neg / n;
		double posa = (double) pos / n;
		double zeroa = (double) zer / n;

		System.out.println(posa);
		System.out.println(nega);
		System.out.println(zeroa);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}

}
