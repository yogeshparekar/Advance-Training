package Problem_Statement2_1;

import java.util.Scanner;

class Palindrome{ 
	
	public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev)) {
	         System.out.println(str+" is a palindrome ");
	      System.out.println("and length of the "+str+ " is-->"+str.length());
	      }
	      else
	         System.out.println(str+" is not a palindrome" );
	      System.out.println("and length of the "+str+ " is-->"+str.length());
	   }
	}