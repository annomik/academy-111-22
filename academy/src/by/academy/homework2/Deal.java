package by.academy.homework2;

import java.util.Random;
import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. 
	//	Программа получает число n, задаваемое с консоли пользователем,
	//	и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды. 
	//	Разделяйте пять карт, выданных каждому игроку, пустой строкой.

		Scanner sc = new Scanner (System.in);
		Random rand = new Random();

		System.out.println("Enter number of players:");
		int n = sc.nextInt();
		
		String [][] allCards = new String [4][13];
		
		String [] suit  = {"Diamond ", "Heart ", "Clubs ", "Spades " };
		String [] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
							"Jack", "Queen","King" };
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				allCards[i][j] = suit[i]+card[j];
			//	System.out.println(allCards[i][j] +" ");				
			}
		}
		
	int j =0;
	while (j < n) {
		
	   for (int i = 0; i < 5; i++) {
		 int randomSuit = rand.nextInt(4);
		 int randomCard = rand.nextInt(13);
		 String [] player = new String [5];
		 	if (allCards[randomSuit][randomCard] == null) {
		 		randomCard = rand.nextInt(13);
		 		randomSuit = rand.nextInt(4);
		 		player[i] = allCards[randomSuit][randomCard] ;
				allCards[randomSuit][randomCard] = null;
		 	}
		 	else {
		 player[i] = allCards[randomSuit][randomCard] ;
		 allCards[randomSuit][randomCard] = null;
		 	}
		 System.out.print(player[i]+ ", ");
		 	
		 }
	   System.out.println("");
	   System.out.println("");
	   j++;
	}		
	
		sc.close();
	}

}
