package assingment1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		int middleRowIndex = rows/2;
		int printUpto = middleRowIndex;
		int printAfter = middleRowIndex;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(i==0 || i==rows-1 || (j<printUpto || j>= printAfter) && i<middleRowIndex || j==0 || j== rows-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			printUpto--;
			printAfter++;
		}
	}

}
