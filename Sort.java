import java.util.*;
public class Sort 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[20];
        int i,j,n;
        System.out.println("Enter the length of the Array");
        n=obj.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
         a[i]=obj.nextInt();
        for(i=0;i<n-1;i++)
         {
             for(j=0;j<n-i-1;j++)
             {
                 if(a[j]>a[j+1])
                 {
                     int temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
         }
         System.out.println("the sorted array is /n");
         for(i=0;i<n;i++)
         System.out.println(a[i]);
    }
}
            
