import java.util.*;
class Employee
{
    Employee(){
        int n,no,basic,DA,IT,net;
        String name;
    }//end of constructor
    void read(){
        System.out.println("Enter the number of Employees");
         n=obj.nextInt();
        for(i=0;i<n-1;i++)
        {
    System.out.println("Enter Employee number,/n name,/n basic salary,/n DA,and IT");
    no=obj.nextInt();
    name=obj.nextLine();
    basic=obj.nextInt();
    DA=obj.nextInt();
    IT=obj.nextInt();
    }}//end of for loop and read fucntion 
    void calculate()//to calculate net salary
    {
        DA=0.75*basic;//75%
        IT=0.3*basic;//30%
        net=basic+DA+IT;
    }
     public static void main(String args[])
    {Scanner obj=new Scanner(System.in);
        for(i=0;i<n-1;i++)
        {
            System.out.println("number="+no);
            System.out.println("name="+name);
            System.out.println("basic salary"+basic);
            System.out.println("DA"+DA);
            System.out.println("IT"+IT);
            System.out.println("Net salary"+net);
        
        }
    }
 
    
    }
