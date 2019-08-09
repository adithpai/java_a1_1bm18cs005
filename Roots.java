import java.util.*;

class Roots
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  double a,b,c,d,root1=0,root2;
  
  System.out.println("Enter the value of a,b and c");
  a=obj.nextInt();
  b=obj.nextInt();
  c=obj.nextInt();
  d=(b*b)-(4*a*c);
  if(d<0)
  System.out.println("No roots");
 else 
   root1=(-b+Math.sqrt(4*a*c))/(2*a);
   root2=(-b-Math.sqrt(4*a*c))/(2*a);
  System.out.println("first root= "+root1);
  System.out.println("second root= "+root2);
  }
}
