package problemstatement1_1;

import java.util.Scanner;

public class Even {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	
	System.out.print("Even Numbers from 1 to "+num+" are: ");
		for (int i = 1; i <= num; i++) {

			   //if number%2 == 0 it means its an even number

			   if (i % 2 == 0) {

			 System.out.print(i + " ");

		}

	}

 }
}