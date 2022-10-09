package assingment1;

import java.util.Scanner;

public class Program5 {
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns= rows;
		int printUpto = rows/2;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(i==0||i==rows-1 || j<printUpto) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<rows/2 - 1) {
				printUpto--;
			}
			else {
				printUpto++;
			}
			System.out.println();
		}
		
	}

}
