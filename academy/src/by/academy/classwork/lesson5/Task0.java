package by.academy.classwork.lesson5;

public class Task0 {

	public static void main(String[] args) {
		// вычислить индексы всех "S"

		String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";
		int a = -1;
		
		
		do  {
		a =	s.indexOf("S",a == -1 ? 0 : a +1 );
			if (a!= -1)	{
				System.out.println(a);
			}
		}
		 while	(a!= -1);
			
	}

}
