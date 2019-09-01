import java.util.*;
import java.math.*;
class Point{ private int x,y;
Point()
{
    int x;
    int y;
}//end of zero arg constructor
Point(int x,int y)
{
    this.x=x;
    this.y=y;
}//end of parameterized constructor
Point(Point P)
{
    x=P.x;
    y=P.y;
}//end of copy constructor


static int dist;
    public static void main(String args[])
    {
        Point P1=new Point(1,2);
        Point P2=new Point(3,4);
        P1.Distance(P2);
        System.out.println("Distance="+dist);
    }
   double Distance()
   {
       dist=Math.sqrt((x*x)+(y*y));
       return dist;
   }
}
        
    

