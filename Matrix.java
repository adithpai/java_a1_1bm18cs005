import java.util.*;
class Matrix
{
 public static void main(String args[])
 { int i,j;
   
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the number of rows and columns for Matrix 1");
 int  rsize1=obj.nextInt();
  int csize1=obj.nextInt();
  System.out.println("Enter the number of rows and columns for Matrix 2");
  int rsize2=obj.nextInt();
  int csize2=obj.nextInt();

 int m1[][]=new int[rsize1][csize1];
   int m2[][]=new int[rsize2][csize2];
   int sum[][]=new int[rsize2][csize2];
   int diff[][]=new int[rsize2][csize2];
  System.out.println("Enter the elements of matrix 1");//inputs
  for(i=0;i<rsize1;i++)
  {
   for(j=0;j<csize1;j++)
   m1[i][j]=obj.nextInt();
  }
  System.out.println("Enter the elements of matrix 2");
  for(i=0;i<rsize2;i++)
  {
   for(j=0;j<csize2;j++)
   m2[i][j]=obj.nextInt();
  }     
 
  for(i=0;i<rsize1;i++)//computing sum
  {
   for(j=0;j<csize2;j++)
   {
   sum[i][j]=(m1[i][j])+(m2[i][j]);
   diff[i][j]=(m1[i][j])-(m2[i][j]);
   }
  }
 System.out.println("SUM=");
 for(i=0;i<rsize1;i++)//display
  {
   for(j=0;j<csize2;j++)
   {
   System.out.print(sum[i][j]+"\t");
   }
    System.out.println("\n");
 }
 System.out.println("Difference=");
 for(i=0;i<rsize1;i++)//display
  {
   for(j=0;j<csize2;j++)
   {
   
   System.out.print(+diff[i][j]);
   }
}

 }
}
