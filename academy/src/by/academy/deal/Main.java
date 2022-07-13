package by.academy.deal;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		
	User seller = new User("Bob", 200);
	User buyer = new User("Nick", 100);	
	
	Product bread = new Product("Bread", 10, 2, 1 );
	Product milk = new Product("Milk", 8, 1, 1 );
	Product apples = new Product("Apples", 7, 3, 1 );
	
	 Cheese feta = new Cheese(35, "Belarus");
	 Cheese parmezan = new Cheese(50, "Italy");
	 Cheese suluguni = new Cheese(30, "Gergia");
	
	Wine redWine = new Wine(5, "red");
	Wine roseWine = new Wine(10, "rose");
	Wine whiteWine = new Wine(10, "white");
	
	System.out.println(redWine.discount() ) ;
	System.out.println(roseWine.discount() ) ;
	
//	public printBill() {
		System.out.println(bread.calcPrice(3.0, 1)); 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Если хотите купить сыр  - введите цифру 1.");
		System.out.println("Если хотите купить вино - введите цифру 2.");
		System.out.println("Если хотите купить сыр  - введите цифру 3.");
		int n = sc.nextInt();
		
		
//	1. Необходимо реализовать программу, которая будет позволять вводить сделки купли-продажи товаров между двумя участниками.
//	В каждой сделке может быть несколько товаров, сумма сделки рассчитывается из суммы всех товаров. 
//	Сумма каждого товара рассчитывается из его стоимости и количества.
//	Программа должна позволить ввести информацию о сделках, сохранить ее в памяти и вывести на экран.
//	Ввод информацию осуществляется с экрана (консоли). 
//	Количество дополнительной информацию о сделке, участнике, товаре придумать самому (больше одного поля для класса). 
//	Сделка должна содержать массив продуктов
	
	}
}
