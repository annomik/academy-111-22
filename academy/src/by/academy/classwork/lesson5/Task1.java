package by.academy.classwork.lesson5;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I like Java!!!";
		int n = s.length()-1;
		boolean result;
		
		System.out.println("б)Last symbol: "+s.charAt(n));
		
		 result = s.endsWith("!!!");
		 System.out.println("в)Проверить, заканчивается ли ваша строка подстрокой !!!: "+result);
		 
		 result = s.startsWith("I like");
		 System.out.println("г) Проверить, начинается ли ваша строка подстрокой I like: "+result);
		 
		 result = s.contains("Java");
		 System.out.println("д) Проверить, содержит ли ваша строка подстроку “Java”: "+result);
		 
		 n = s.indexOf("Java");
		 System.out.println("Найти позицию подстроки Java: "+ n);
		 
		 String newS = s.replace("a", "o");
		 System.out.println(newS);
		 
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 
		 newS = s.substring (n, n+4);
		 System.out.println(newS);
		
		
	}

}
