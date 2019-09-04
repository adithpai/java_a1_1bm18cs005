import java.util.*;
class Two_D_Array
{
	float m[][];
	int ns,nm;
	void getdata()
	{    Scanner obj=new Scanner(System.in);
		System.out.println("Enter no of students and marks");
		
		ns=obj.nextInt();
		nm=obj.nextInt();
		m=new float[ns+2][nm+2];
		System.out.println("Enter elements in matrix");
		for(int i=0;i<ns;i++)
		{
			for(int j=0;j<nm;j++)
			{
				m[i][j]=obj.nextFloat();
			}
		}
	}
	void calculate()
	{
		float sum=0;
		float avg=0;
		for(int i=0;i<ns;i++)
		{
			for(int j=0;j<nm;j++)
			{
				
				sum=sum+m[i][j];
			}
				m[i][nm]=sum;
				avg=(float)sum/nm;
				m[i][nm+1]=avg;
				sum=0;
			
		}
		for(int j=0;j<nm;j++)
		{
			for(int i=0;i<ns;i++)
			{
				
				sum=sum+m[i][j];
			}
				m[ns][j]=sum;
				avg=(float)sum/ns;
				m[ns+1][j]=avg;
				sum=0;
			
		}
	}
	void display()
	{
		System.out.println(" Marks= ");
		for(int i=0;i<ns+2;i++)
		{
			for(int j=0;j<nm+2;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}
class Student
{
	public static void main(String args[])
{
	Two_D_Array d=new Two_D_Array();
	d.getdata();
	d.calculate();
	d.display();
}
}
