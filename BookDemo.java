//Create a class Book which contains four members: name, author,
//price, num_pages. Include a constructor to set the values for the
//members. Include methods to set and get the details of the objects.
//Include a toString( ) method that could display the complete details
//of the book. Develop a Java program to create n book objects.
import java.util.*;
class Book
{String name,author_name;
 int price,num_pages;
 Book(String name,String author_name,int price,int num_pgs);
 {
  this.name=name;
  this.author_name=author_name;
  this.price=price;
  this.num_pgs=num_pages;
 }
 void set()
 {Scanner obj=new Scanner(System.in);
  System.out.println("Enter name,Author name,price and number of pages ");
  name=obj.next();
  author_name=obj.next();
  price=obj.nextInt();
  num_pgs=obj.nextInt();
 }
  String toString()
  {
    String s="name=\n"+name+"author_name=\n"+author_name;
    return s;
  }
}
 class BookDemo
{ public static void main(String args[])
  { 
   Book n=new Book(String name,String author_name,int price,int num_pgs);
   System.out.println(n);
  }
}
  
 
                                                                                                                                                                                                                                                                    
 
