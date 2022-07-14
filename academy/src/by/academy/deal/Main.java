package by.academy.deal;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		
	User seller = new User("Bob", 200);
	User buyer = new User("Nick", 100);	
	
//	Product bread = new Product("Bread", 10, 2);
//	Product milk = new Product("Milk", 8, 1);
//	Product apples = new Product("Apples", 7, 3 );
	
	 Cheese feta = new Cheese(35, "Belarus");
	 Cheese parmezan = new Cheese(50, "Italy");
	 Cheese suluguni = new Cheese(30, "Gergia");
	
	Wine redWine = new Wine(5, "red");
	Wine roseWine = new Wine(10, "rose");
	Wine whiteWine = new Wine(10, "white");
	
	System.out.println(redWine.discount() ) ;
	System.out.println(roseWine.discount() ) ;
	

		System.out.println(suluguni.calcPrice(3.0, 1)); 
		Scanner sc = new Scanner(System.in);
		
	int n =0;	
	
	do {	
		
		System.out.println("Если хотите купить сыр    - введите цифру 1.");
		System.out.println("Если хотите купить вино   - введите цифру 2.");
		System.out.println("Если хотите купить фрукты - введите цифру 3.");
		int number = sc.nextInt();
			
	if (number == 1) {
		System.out.println("Выберите сыр: 1 - сыр Фета; 2 - сыр Пармезан; 3 - сыр Сулугуни");
		int cheese = sc.nextInt();
		System.out.println("Выберите количество");
		if (sc.hasNextInt() ) {
			int amountCheese = sc.nextInt();
			}
		else System.out.println("Некорректные данные");
	}
		
	else  if (number == 2) {
			System.out.println("Выберите вино: 1 - Красное вино; 2 -Розовое вино; 3 - Белое вино");
			int wine = sc.nextInt();
			System.out.println("Выберите количество");
			if (sc.hasNextInt() ) {
				int amountWine = sc.nextInt();
				}
			else System.out.println("Некорректные данные");
			
	 }	else if (number == 3) {
		 	System.out.println("Выберите фрукты: 1 - Банан; 2 - Авокадо; 3 - Апельсин");
		 	int fruit = sc.nextInt();
		 	System.out.println("Выберите количество");
		 	if (sc.hasNextInt() ) {
		 		int amountFruit = sc.nextInt();
		 		}
		 	else System.out.println("Некорректные данные");
		}
	//for (int i )
	
	System.out.println("Введите 1, если хотите продолжить покупки.");
	System.out.println("Введите 2, если хотите оформить заказ.");
	n = sc.nextInt();
	
	} while (n == 1);
	
	
	
//	switch (number) {		 
//	case 1 : {	
//		System.out.println("Выберите сыр: 1 - сыр Фета; 2 - сыр Пармезан; 3 - сыр Сулугуни");
//		int cheese = sc.nextInt();
//		System.out.println("Выберите количество");
//		break;
//	}
//	case 2 : {	
//		System.out.println("Выберите вино: 1 - Красное вино; 2 -Розовое вино; 3 - Белое вино");
//		break;
//	}
//	case 3 : {	
//		System.out.println("Выберите фрукты: 1 - Бананы; 2 - Авокадо; 3 - Апельсин");
//		break;
//	}
//	
//	default: System.out.println("Некорректно введенные данные!");
//
//	}
	 
	sc.close();
	
//	public printBill() {	
	}
}
