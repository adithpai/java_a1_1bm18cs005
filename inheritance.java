
//Practice the code on inheritance done in class.
//Write a program to print the largest integer amount all values supplied as command line arguments.
//Write a program to implement Queue in Java.
//Write a java program to built a class Vehicle. Member variables: String model, int year, String color and int total_number_of_vehicles(static member variable) and include parameterized constructor and output function. Inside main create an array of n vehicle objects and display the total number of objects(use static function).
import java.util.*;
class 2D
{
private int l,b;
2D()
{
l=0;
b=0;
}
2D(int l, int b)
{
this.l=l;
this.b=b;
}
int area()
{
return l*b;
}
}
class 3D extends 2D
{
int h;
3D()
{
super();
h=0;
}
3D(int l, int b)
{
super(l,b)
this.h=h;
}
int value()
{
return area()*h;
}
}
class Demo
{
public static void main(String args[])
{
3D ob = new 3D(1,2);
}
