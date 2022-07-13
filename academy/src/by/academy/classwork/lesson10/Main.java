package by.academy.classwork.lesson10;

public class Main {
    public static void main(String[] args) {


       Ford focus = new Ford("Focus", "Bob");
       Ford fiesta = new Ford("Fiesta", "Tom");
       fiesta.setSpeed(140) ;
       focus.setAge(3);
       fiesta.setAge(8);
       fiesta.setColor("red");
       System.out.println("Цвет авто: " + fiesta.getColor());

       fiesta.paint(11);
      System.out.println("Цвет авто: " + fiesta.getColor());


   }
}