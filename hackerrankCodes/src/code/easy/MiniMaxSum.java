package code.easy;

import java.util.Scanner;

public class MiniMaxSum {
	// Complete the miniMaxSum function below.
	static void miniMaxSum2(int[] arr) {
		long sum = 0, min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		System.out.println((sum - max) + " " + (sum - min));
	}

	static void miniMaxSum(int[] arr) {
		int n = arr.length;
		long min = 0, max = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n - 1; i++)
			min += arr[i];
		for (int i = 1; i < n; i++)
			max += arr[i];
		System.out.println(min + " " + max);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum2(arr);

		scanner.close();
	}

}
