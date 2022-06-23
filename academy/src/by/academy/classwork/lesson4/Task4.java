package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// 4. С клавиатуры вводятся n чисел. 
		//	Составьте программу, которая определяет кол-во отрицательных,
		//	кол-во положительных и кол-во нулей среди введеных чисел.
		//	Значение n вводится с клавиатуры.

		int amountNull=0;
		int amountPlus=0;
		int amountMinus=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число n:");

		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			

			for (int i=0; i<n; i++) {
				
				System.out.println("Число "+i+" :"); 
				
				if (sc.hasNextInt()) {
					int number = sc.nextInt();
					
					if (number == 0) {
						amountNull++;
					}
					else if (number > 0 ) {
						amountPlus++;
						}
						else amountMinus++;
				}
				else {
					System.out.println("Некорректные данные!");
					break;
				}
			}
				System.out.println("Количество положительных чисел: "+amountPlus);
				System.out.println("Количество нулей: "+amountNull);
				System.out.println("Количество отрицательных чисел: "+amountMinus);
			}
			else 
				System.out.println("Некорректные данные! Введите число.");
		

		sc.close();
	}

}
