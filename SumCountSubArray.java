import java.util.Scanner;
/* "Given an unsorted array A of size N, find a continuous sub-array which  sums up to S.

For example if the input array is [ 12,7,29,6, 2, 11,4,8] and the  expected sum is 8, then there are two possibilities [6,2] and [8]
if the expected sum is 19 there are two possibilites [12,7] and [6,2,11].  [11,8] is not a possibility since its not continous. */

public class SumCountSubArray {
	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the Number : ");

		int number = sc.nextInt();		

		int[] arr=  { 12,7,29,6, 2, 11,4,8};

		for (int k = 0; k < arr.length; k++) {

			int sum = 0;

			for (int j = k; j < arr.length; j++) {

				sum = sum + arr[j];

				if (sum == number) {

					for (int i = k; i <= j; i++) {

						System.out.print(arr[i] + " ");

					}

					System.out.println();

				} else if (sum > number) {

					break;

				}



			}

		}

	}




}
