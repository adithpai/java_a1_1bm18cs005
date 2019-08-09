import java.util.*;
class Calci
{//calculator program
 public static void main(String args[])
{  
 Scanner sc=new Scanner(System.in);
 int a,b,c;
 System.out.println("Enter the first number");
 a=sc.nextInt();
 System.out.println("Enter the operation to be performed");
 c=sc.next().charAt(0);
 System.out.println("Enter the second number");
 b=sc.nextInt();
 switch(c)
 { 
  case '+': int sum=a+b;
            System.out.println("Sum= "+sum);
            break;
  case '-': int diff=a-b;
            System.out.println("difference="+diff);
            break;
  case '*': int product=a*b;
            System.out.println("product="+product);
            break;
  case '/': float quotient=(float)a/b;
            System.out.println("quotient="+quotient);
            break;
  default: System.out.println("Thats not an operation bruh");
 }
}
}


           

 
