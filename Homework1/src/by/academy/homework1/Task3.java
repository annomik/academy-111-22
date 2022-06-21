package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите число от 1 до 10:");
		
		number = sc.nextInt();
		
		for (int n=1; n <= 10;n++) {
			System.out.println(number+" * "+ n +" = "+ number*n);
				}	
		
		sc.close();
	}

}
