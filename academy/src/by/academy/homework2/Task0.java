package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Task0 {

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		int pairsCount1 =0;
		// write code here
			bubbleSort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			//for (int j = i+1; j < arr.length-1; j++ ) {
				if (Math.abs(arr[i]-arr[i+1]) == k) {
					pairsCount++;
					}
		}	
		for (int j = 0; j < arr.length-2; j++) {
				if (Math.abs(arr[j]-arr[j+2]) == k){
					pairsCount1++;
					}		
				}
			
		return pairsCount+pairsCount1;
		}

	
		private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		
	}


		private static final Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) throws IOException {

			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]); //размер массива

			int k = Integer.parseInt(nk[1]);
			
			System.out.println("Enter an array of numbers:");

			int[] arr = new int[n];

			String[] arrItems = scanner.nextLine().split(" ");

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(arrItems[i]);
				System.out.println(arr[i]);
			}

			int result = pairs(k, arr);
			System.out.println("Result: "+result);

			scanner.close();
		}

		
		
	}


