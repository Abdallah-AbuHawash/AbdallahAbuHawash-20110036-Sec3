
package gpa;

//Library (Scanner)
import java.util.Scanner;


public class GPA {


    //method for the number of classes
    public static void classesInput(){
        
            Scanner scan = new Scanner(System.in); //creating a scanner to take input from a user
           //try and catch (exceptions) to make sure the input is right and the program doesn't have any problems
            try{
            System.out.println("Enter the number of courses: ");
             String totalCourses= scan.nextLine();
             double Courses = Double.parseDouble(totalCourses); //transforming totalCourses from a String to a double 
              gradeInput(Courses);  //Parameter is passed
            }
            catch(NumberFormatException e){
                System.out.println("Try again! It should be a number!");
            }   
           
    }
    
    //method for the grades    
    public static void gradeInput(double Courses){
        
            Scanner scan = new Scanner(System.in);            
              double totalGrade = 0d;     

            for (double i = 0d; i < Courses; i++) { //for loop
           System.out.println("Enter the Letter of the grade: ");
            String letterGrade = scan.nextLine(); 
             double gradevalue = 0d;
             
                switch (letterGrade) { //switch to define the letters of the grades with their numeric value
                    case "D","d": //capital and small letters
                        gradevalue=4.0d;
                        break;
                    case "M","m":
                        gradevalue=3.2d;
                        break;
                    case "P","p":
                        gradevalue=2.4d;
                        break;     
                    case "F","f":
                        gradevalue=1.6d;
                        break;
                    default:
                        System.out.println("wrong grade");
                        break;
                }

          
            totalGrade +=gradevalue; 

        }
            double points = totalGrade;
            double gpa = points/Courses;
            gpaOutput(gpa);              

    }   
    //gpa calculation
    static void gpaOutput(double gpa){

            System.out.println("Your GPA is: "+ gpa);
            System.out.print("Which means: ");
            
                if(gpa<2.4) //if else statments to print the GPA in letter
                    System.out.println("F");
                else if(gpa>=2.4 && gpa<2.8)
                    System.out.println("P");
                else if(gpa>=2.8 && gpa<3.6)
                    System.out.println("M");
                else if(gpa>=3.6 && gpa<=4)
                    System.out.println("D");

    }
    //main method
    public static void main(String[] args) {
        classesInput(); 
    }
}

