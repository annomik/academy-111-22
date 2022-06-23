package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// 3. Составьте программу, составьте программу, 
		// которая вычисляет произведение чисел от 1 до n. Значение n	 вводится с клавиатуры.

		long a=1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");

		if (sc.hasNextInt()) {
			int n = sc.nextInt();

			//int n = sc.nextInt();

			for (int i=1; i<=n;i++) {
				a =a * i;
			}

			System.out.println(a);
		}
		else 
			System.out.println("Некорректные данные! Введите число.");
		
		sc.close();
	}
}