//SGPA java
import java.util.*;
class Student{
    
          int usn;
          String name;
          float marks[]=new float[5];
          float creditpoints,totalcp=0.00;
         
        
      float calculate(float SGPA){int i;
         for(i=0;i<4;i++)
            {
                if(marks[i]<=100&&marks[i]>=80)
                
                    creditpoints=9*4;// s grade
                
                else if(marks[i]<80&&marks[i]>=70)
                
                    creditpoint=8*4;// a grade
                
                else if(marks[i]<70&&marks[i]>=60)
                
                    creditpoints=7*4;//b grade
                
                else if(marks[i]<60&&marks[i]>=50)
                
                    creditpoints=6*4; //c grade
                
                
                    else if(marks[i]<50&&marks[i]>=40)
                    
                        creditpoints=5*4;
                    
                  else if(marks[i]<40)
                  
                      creditpoints=0;
                  
            totalcp=totalcp+creditpoints;
            }//end of for
            SGPA=totalcp/20;
            return creditpoints;
            return SGPA;
                                  
            
        }
        public void main(String args[])
        {
          Scanner obj=new Scanner(System.in);
         System.out.println("Enter USN,name,marks in 5 subject,each subject is 4 credits");
         usn=obj.nextInt();
         System.out.println("USN"+usn);
         name=obj.nextLine();
         for(i=0;i<4;i++)
         marks[i]=obj.nextFloat();
         float display(float SGPA,int usn);
        }//end of main
    
    float display(float SGPA,int usn){
        System.out.println("SGPA="+SGPA); 
          System.out.println("name="+name);
          System.out.println("USN="+usn);
         return SGPA;
         
         
    
        }//end of display
          
          
    }


