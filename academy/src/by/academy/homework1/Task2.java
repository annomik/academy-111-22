package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ��� ������:");
			
		type = sc.nextLine();

		switch (type) {		 
		case "int": {
			System.out.println("������� ����������:");
			if (sc.hasNextInt() ) {
				int x = sc.nextInt();
				System.out.println(x%2);
				}
			else System.out.println("������������ ������!");
				}
		break;

		case "double": {
			System.out.println("������� ����������:");
			if (sc.hasNextDouble()) {
				double x = sc.nextDouble();
				System.out.println(x*0.7);	 
				}
			else System.out.println("������������ ������!");
		}
		break;

		case "float":{
			System.out.println("������� ����������:");
			if (sc.hasNextFloat()) {
				float x = sc.nextFloat();
				System.out.println(x*x);	
				}
			else System.out.println("������������ ������!");
		}
		break;

		case "char":{
			System.out.println("������� ����������:");			
			char x = sc.next().charAt(0);
			System.out.println(x+ " " + (int)x);
		}
		break;

		case "String":{
			System.out.println("������� ����������:");
			String x = sc.nextLine();
			System.out.println("Hello "+x);	
			 }
		break;

		default: System.out.println("Unsupported type");

		}
		sc.close();
	}

}
