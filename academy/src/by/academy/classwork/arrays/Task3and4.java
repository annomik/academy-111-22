package by.academy.classwork.arrays;

public class Task3and4 {
	public static void main(String[] args) {
		
//		3. Создать двумерный массив типа char размером 4х2. 
//		И записать туда значения с помощью блока для инициализации. 
//		Распечатать значения массива. 
		
		char [][] arr =  {{'1',98}, {'a',120}, {66,80}, {707, '4'}};
				
		for (int i = 0; i < arr.length; i++ ){
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( "  "+arr[i][j]+ "  ");
			}
			System.out.println("");
		}
		System.out.println("////////////TASK 5///////////");		
//////// TASK 5	////////////////////	
//	4. Создать двухмерный массив 5х8 и инициализировать 
//	его с помощью блока для инициализации. 
//	Найти максимальное и минимальное значение в каждой "строке" 
//	и записать эти значения в двухмерный массив 5х2. 
//	Распечатать оба массива.
		
		int arrMaxMin [][] = new int [5][2];
		
		int array [][] = {
				{1,5,12,8,0,9,77,4},
				{10,5,102,8,-64,-9,7,4},
				{1,5,1002,8,-400,-9,7,40},
				{109,5,101,8,6,9,78,4},
				{18,5,142,8,-64,-9,-957,4}   
		};
				
		for (int i = 0; i < array.length; i++) {
			int	max = array[i][0];	
			int	min = array[i][0];
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j] > max) {
					max = array[i][j];
				}
				if (array[i][j] < min) {
					min = array[i][j];
				}
			System.out.print( " "+array[i][j]+ " ");
			}
			arrMaxMin[i][0] = max;
			arrMaxMin[i][1] = min;
		
		System.out.println(" ");
		}
		
		for (int i = 0; i < arrMaxMin.length; i++) {
			for (int j = 0; j < arrMaxMin[i].length; j++) {
				System.out.print(arrMaxMin[i][j]+ "   ");
			}
		System.out.println("");
		}
		
	}

}