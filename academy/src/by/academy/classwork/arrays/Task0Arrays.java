package by.academy.classwork.arrays;

public class Task0Arrays {

	public static void main(String[] args) {
		/* 0. Создать массив типа String с размером 7. 
		 * Записать в него значения дней недели. 
		 * Вывести на консоль значение последнего элемента.
		 */
		
		String [] weekdays = new String[7] ;
		weekdays[0] = "Monday";
		weekdays[1] = "Tuesday";
		weekdays[2] = "Wednesday";
		weekdays[3] = "Thursday";
		weekdays[4] = "Friday";
		weekdays[5] = "Saturday";
		weekdays[6] = "Sunday";
					
		System.out.println(weekdays[6]);
		
//	1. Создать массив типа double с размером 4.
//	 Записать в него любые значения с помощью блока для инициализации. 
//	 Вывести на консоль значение первого элемента
		
	double [] arr = {81,4,11,66};
	System.out.println(arr[0]);
		
		
	}
}
