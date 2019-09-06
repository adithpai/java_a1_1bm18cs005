
//Write a java program to built a class Vehicle. Member variables: String model, int year, String color and int total_number_of_vehicles(static member variable) and include parameterized constructor and output function. Inside main create an array of n vehicle objects and display the total number of objects(use static function).
import java.util.*;
class Vehicle
{ String model,color;
  int year;
  static int total_number_of_vehicles;
  Vehicle(String model)
  { 
    this.model=model;
    this.color=color;
    this.year=year;
    total_number_of_vehicles++;
  }
}
class VehicleDemo
{ public static void main(String args[])
 { 
  System.out.println("Enter the Vehicle model,year,color");
  Scanner sc=new Scanner(System.in);
  model=sc.next();
  year 
  Vehicle v1=new Vehicle("ford GT");
  Vehicle v2=new Vehicle("Benz");
}
  



