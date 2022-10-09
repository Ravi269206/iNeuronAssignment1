package assingment1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		int columns = (rows-1)*2;
		int printUpto = 2;
		int printAfter = columns-printUpto+1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				if(j<printUpto || j>printAfter) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			printUpto++;
			printAfter--;
		}
	}
}
