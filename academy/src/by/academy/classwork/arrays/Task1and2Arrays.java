package by.academy.classwork.arrays;

public class Task1and2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] arr = new double [4];
		{ arr[0] = 54;
		arr[1] = -3;
		arr[2] = 0;
		arr[3] = 15;
		}
		
		System.out.println(arr[0]);
		
//		-----Task2-----		
		
		String [][]array = new String [3][6];
		char letter = 97;	
		
		for (int i = 0; i <array.length; i++) {
			
			for (int j = 0; j<array[i].length; j++) {
				
				String s = String.valueOf(letter);
				array[i][j] = (s+(j+1));
				System.out.print(array[i][j]+" ");
				}
			
			System.out.println("");
			letter++;
		}
	}

}
