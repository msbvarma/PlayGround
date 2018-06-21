package com.prac.pattren;
import java.util.Scanner;
public class PyramidPattren {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		if(input>0)
		getPyramid(input);

	}
	static void getPyramid(int n){
 
		//print spaces
		for(int i=1;i<n;i++){
			//print spaces
			for(int j=1;j<=(n-i);j++)
			System.out.print(" ");
			
			//print * for first 
			for(int k=1;k<=i;k++)
			System.out.print("*");
			
			for(int m=1;m<i;m++)
			System.out.print("*");
		
			System.out.println(" ");
		}
	}

}
