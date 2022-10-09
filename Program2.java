package assingment1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 1;
		System.out.println("Enter Number of Rows Required");
		int rowCount = sc.nextInt();
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<rowCount;j++) {
				System.out.print(value+" ");
			}
			System.out.println();
			value++;
		}
	}

}
