import java.util.*;
class Rectangle
{
 int length;
 int breadth;
 int area;
 void input()
 {Scanner sc=new Scanner(System.in);
  System.out.println("Enter length and breadth");
  length=sc.nextInt();
  breadth=sc.nextInt();
  }
 void output()
 {
  System.out.println("Area ="+area);
 }
void compute()
{
  area=length*breadth;
 }
}

class RectangleDemo
{
 public static void main(String args[])
 { Rectangle rec1=new Rectangle();
   Rectangle rec2=new Rectangle();
  rec1.input(); rec1.compute(); rec1.output();
  rec2.input(); rec2.compute(); rec2.output();
 }
}

