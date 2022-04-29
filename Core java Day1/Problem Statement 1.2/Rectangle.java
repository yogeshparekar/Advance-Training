package Problem_Statement_1_2;

import java.util.Scanner;

public class Rectangle {
	    int length; 
	    int breadth; 
	    int area; 
	   
	    public Rectangle()
	    {
	    	length = 0;
	    	breadth= 0;
	    }

	    void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter length of rectangle: ");
	        length = in.nextInt();
	        System.out.print("Enter breadth of rectangle: ");
	        breadth = in.nextInt();
	    }

	    void calculate() {
	        area = length * breadth;
	        
	    }

	    void display() {
	        System.out.println("Area of Rectangle = " + area);
	       
	    }

	    public static void main(String args[]) {
	        Rectangle obj1 = new Rectangle();
	        obj1.input();
	        obj1.calculate();
	        obj1.display();
	        
	       
	    }
	}