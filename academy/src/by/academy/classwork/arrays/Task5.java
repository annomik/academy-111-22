package by.academy.classwork.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
//  5. Реализовать задачу с гирляндой используя массивы. 
//	Для реализации бегущей строки используйте метод System.arraycopy(...);
		
		int [] arrr = new int[32];
		Random rand = new Random();
		
		for (int i = 0; i < arrr.length; i++) {
			arrr[i] = rand.nextInt(2);
			System.out.print(arrr[i]+ " "); //  метод, который будет распечатывать текущее состояние гирлянды. 
		}
		System.out.println(" ");
		
//   метод, который будет выяснять включена ли лампочки на первой позиции; 		
		if (arrr[0] == 1) {
			System.out.println("Первая лампочка включена");
		} else {
			System.out.println("Первая лампочка НЕ включена");
		}
// метод который будет мигать лампочками гирлянды заданное количество раз;
	Scanner sc = new Scanner(System.in);
	System.out.println("Сколько раз мигать лампочкам? Введите число:");
	int number = sc.nextInt();
		
	int m = 0;
	while ( m < number) {
		for (int i = 0; i < arrr.length; i++) {
			if (arrr[i] == 0) {
				arrr[i] = 1;
			} else {
				arrr[i] = 0;
			}
			System.out.print(arrr[i] + " ");
		}
	System.out.println(" ");	
	m++; 
	}

	
//	метод, который будет запускать гирлянду в режим бегущей строки	
//	Для реализации бегущей строки используйте метод System.arraycopy(...);	

	int[] ar2 = new int [arrr.length];
	
	for (int i = 0; i < 20; i++) {  
		
		ar2[0] = arrr[arrr.length-1];
		
		System.arraycopy(arrr, 0, ar2, 1, arrr.length-1);
		System.out.println(Arrays.toString(ar2));
		System.arraycopy(ar2, 0, arrr, 0, arrr.length);
		}
	
	}

}
