package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ParseException {
	
	Product [] basket = new Product[10];	
	
	User seller = new User("Bob", 500);
	User buyer = new User("Nick", 500);	
	
	
	Cheese feta = new Cheese("Фета",10, 1 ,35, "Belarus");
	Cheese parmezan = new Cheese("Пармезан", 14,1, 50, "Italy");
	Cheese suluguni = new Cheese("Сулугуни", 9, 1, 30, "Gergia");
	
	Wine redWine = new Wine("Красное вино",160, 1, 5, "red");
	Wine roseWine = new Wine("Розовое вино",90, 1, 2, "rose");
	Wine whiteWine = new Wine("Белое вино", 220, 1,7, "white");
	
	Fruit banana = new Fruit("Банан", 5, 1, "Пакистан", true);
	Fruit avocado = new Fruit("Авокадо", 12, 1, "Перу", false);
	Fruit orange = new Fruit("Апельсин", 7, 1, "Италия", true);
	
	System.out.println("Скидка на красное: "+redWine.discount() ) ;
	System.out.println("Скидка на розовое: "+roseWine.discount() ) ;
//	System.out.println(suluguni.calcPrice()); 
			
	Scanner sc = new Scanner(System.in);
	
		
	
	int number1;	
	int m = 0;
	do {	
		
		System.out.println("Выберите сыр: 1 - сыр Фета; 2 - сыр Пармезан; 3 - сыр Сулугуни.");
		System.out.println("Выберите вино: 4 - Красное вино; 5 -Розовое вино; 6 - Белое вино.");
		System.out.println("Выберите фрукты: 7 - Банан; 8 - Авокадо; 9 - Апельсин."
				+ "	\n ---Введите 0, если хотите завершить покупки---");
		number1 = sc.nextInt();
		
		if (number1 == 0) 
			{ break;}
		
		switch (number1) {		 
		case 1 : {
			basket[m] = feta;
			break;
		}
		case 2 : {	
			basket[m] = parmezan;
			break;
		}
		case 3 : {
			basket[m] = suluguni;
			break;
		}
		case 4 : {	
			basket[m] = redWine;
			break;
		}
		case 5 : {
			basket[m] = roseWine;
			break;
		}
		case 6 : {	
			basket[m] = whiteWine;
			break;
		}			
		case 7 : {
			basket[m] = banana;
			break;
		}
		case 8 : {	
			basket[m] = avocado;
			break;
		}
		case 9 : {	
			basket[m] = orange;
			break;
		}
		default: System.out.println("Некорректно введенные данные!");
		}

	// System.out.println("Товар добавлен в корзину.");
		
		m++;
	} while ((number1 > 0) && (number1 < 10));
	
	Deal deal = new Deal(seller, buyer, basket) ;
	for (int i = 0; i < basket.length; i++) {
		deal.addProduct(basket[i]);
		}
//	System.out.println(deal);
	
	deal.setBuyer(buyer);
	deal.setSeller(seller);
			
	deal.BillPrint(deal);
	
    SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");	
//	
//	Date date = new Date();	 
//	System.out.println("Введите свою дату рождения в формате: dd/MM/yyyy или dd-MM-yyyy"); 
//	String dateBirth = sc.next();
//	 while (true) {	
//		
//		if (date.test(dateBirth)) {
//			SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
//			java.util.Date date1	= format1.parse(dateBirth);
//			//Calendar calendar = Calendar.getInstance();
//           // calendar.setTime(date1);
//			System.out.println(date1);
//		}
//	 }
	
	
	
	
	
	sc.close();
	

	}
}
