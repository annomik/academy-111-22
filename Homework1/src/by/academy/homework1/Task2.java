package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите тип данных:");
		type = sc.nextLine();

		switch (type) {		 
		case "int": {
			System.out.println("Введите переменную:");
			int x = sc.nextInt();
			System.out.println(x%2);		}
		break;

		case "double": {
			System.out.println("Введите переменную:");
			double x = sc.nextDouble();
			System.out.println(x*0.7);	 	}
		break;

		case "float":{
			System.out.println("Введите переменную:");
			float x = sc.nextFloat();
			System.out.println(x*x);		}
		break;

		case "char":{
			System.out.println("Введите переменную:");			
			char x = sc.next().charAt(0);
			System.out.println((int)x);
		}
		break;

		case "String":{
			System.out.println("Введите переменную:");
			String x = sc.nextLine();
			System.out.println("Hello "+x);		}
		break;

		default: System.out.println("Unsupported type");

		}
		sc.close();
	}

}
