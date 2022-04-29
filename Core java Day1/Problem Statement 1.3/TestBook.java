package problemstatement1_3;

import java.util.Scanner;
public class TestBook
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String booktitle=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        
        Book obj=new Book();
        obj.setBookTitle(booktitle);
        obj.setBookPrice(price);
        System.out.println("Book Details");
        System.out.println("Book Title :"+obj.getBookTitle());
        System.out.println("Book Price :"+obj.getBookPrice());
       
    }
}
