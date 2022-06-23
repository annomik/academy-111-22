package by.academy.classwork.lesson4;

public class Task0Arrays {

	public static void main(String[] args) {
		/* 0. Создать массив типа String с размером 7. 
		 * Записать в него значения дней недели. 
		 * Вывести на консоль значение последнего элемента.
		 */
		
		String [] weekdays = new String[7] ;
		weekdays[0] = "Monday";
		weekdays[1] = "Tuesday";
		weekdays[2] = "Wednessday";
		
		weekdays[4] = "Friday";
		weekdays[5] = "Saturday";
		weekdays[6] = "Sunday";
		weekdays[6] = "Thursday";
		
	
		System.out.println(weekdays[6]);
		
	}
}
