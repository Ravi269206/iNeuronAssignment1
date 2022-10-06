package ineruonProjectsAssigment1;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		// Creating scanner object and taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of the words");
		int height = sc.nextInt();
		
		//looping to print the values
		for(int i=0;i<height;i++) {
			//I
			for(int j=0;j<height+1;j++) {
				
				if((j==height/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//N
			for(int j=0;j<height+1;j++) {
				if(j==0 || j== height-1 || j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
		}
		// E
		for(int j=0;j<height+1;j++) {
			if(j==0 || (i==0 || i==height-1 || i== (height-1)/2) && j!=height) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
		}
		
//		//U
		for(int j=0;j<height+1;j++) {
			if(j==0 || j==height-1 || i== height-1 && j!= height) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
		}
		//R
		for(int j=0;j<height+1;j++) {
			if(j==0 ||j==height-1 && i<(height-1)/2 || j==i && i> (height-1)/2 || (i== 0 || i== (height-1)/2)&&j!= height) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
	}
		
		// O
		for (int j=0; j<height+1;j++) {
			if(j==0 || j==height-1 || (i== 0 || i == height-1)&& j != height) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			
		//N	
		for(int j=0;j<height+1;j++) {
				if(j==0 || j== height-1 || j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
		}	
			System.out.println();
	  }
	}
}
