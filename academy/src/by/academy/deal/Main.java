package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ParseException {
	
	
	
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
		
	Deal deal = new Deal() ;	
	deal.setBuyer(buyer);
	deal.setSeller(seller);
	
	int number;	
	int m = 0;
	do {			
		System.out.println("Выберите сыр: 1 - сыр Фета; 2 - сыр Пармезан; 3 - сыр Сулугуни.");
		System.out.println("Выберите вино: 4 - Красное вино; 5 -Розовое вино; 6 - Белое вино.");
		System.out.println("Выберите фрукты: 7 - Банан; 8 - Авокадо; 9 - Апельсин."
				+ "	\n ---Введите 0, если хотите завершить покупки---");
		
		number = sc.nextInt();
		
		if (number == 0) 
			{ break;}
		
		switch (number) {		 
		case 1 : {
			deal.addProduct(feta);
			break;
		}
		case 2 : {	
			deal.addProduct(parmezan);
			break;
		}
		case 3 : {
			deal.addProduct(suluguni);
			break;
		}
		case 4 : {	
			deal.addProduct(redWine);
			break;
		}
		case 5 : {
			deal.addProduct(roseWine);
			break;
		}
		case 6 : {	
			deal.addProduct(whiteWine);
			break;
		}			
		case 7 : {
			deal.addProduct(banana);
			break;
		}
		case 8 : {	
			deal.addProduct(avocado);
			break;
		}
		case 9 : {	
			deal.addProduct(orange);
			break;
		}
	default: System.out.println("Некорректно введенные данные!");
	}
	
		m++;
		
	} while ((number > 0) && (number < 10));
	
	
//	for (int i = 0; i < basket.length; i++) {
//		deal.addProduct(basket[i]);
//		}
//	System.out.println(deal);
					
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
