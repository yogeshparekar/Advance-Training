package Problem_Statement6_1;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Student {
 public static void main (String[] args) {
	 ArrayList<String> a1=new ArrayList<String>();
 int n;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the number of students:");
 n=sc.nextInt();
 System.out.println("enter the student names:");
for(int i=0;i<n;i++)
{
	a1.add(sc.next());
}
System.out.println("student list:");
for(String a:a1)
{
		System.out.println("enter the name of the student to be searched:");
	    String st=sc.next(); 
	    int position=Collections.binarySearch(a1,st);
		System.out.println("posistion of"+st+"is:"+position);
		
		}
 }
 }