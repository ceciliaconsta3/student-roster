/**
 * This program will maintain a roster of students, their info, and grades in a given course
 * @author Cecilia C Constantine 
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Roster {
    
    // static which means the Roster will use the same list
    static ArrayList<Student> myRoster = new ArrayList<>();
    
    public static void main(String[] args) {
        // add student data into the Roster    
        Roster.add("1","John","Smith","John1989@gmail.com",20,88,79,59);
        Roster.add("2","Suzan","Erickson","Erickson_1990@gmailcom",19,91,72,85);
        Roster.add("3","Jack","Napoli","The_lawyer99yahoo.com",19,85,84,87);
        Roster.add("4","Erin","Black","Erin.black@comcast.net",22,91,98,82);
        Roster.add("5","Cecilia","Constantine","ceciliaconsta3@gmail.com",28,95,75,90);
        
       
        print_all();
        print_invalid_emails();
        print_average_grade("4");
        remove("5");
        remove("5");
        print_all();
    }
    
    // adds student information into the myRoster
    public static void add(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3){
        int[] grades = {grade1, grade2, grade3};
        Student newStudent = new Student(studentId, firstName, lastName, email, age, grades);
        // store this new student in our ArrayList
        myRoster.add(newStudent);
    }
    
    // removes student from Roster by student ID
    public static void remove(String studentId) {
        System.out.println("Removed Student IDs:");
        Iterator<Student> iterator = myRoster.iterator();
         while(iterator.hasNext()) {
            Student next = iterator.next();
                if(next.getID().equals(studentId)) {
                    iterator.remove();
                    System.out.println(studentId + "\thas been removed from the Roster");  
                    return;
                }              
            }
        System.out.println(studentId + "\tis not on the roster");  
    }

    // print out Roster 
    public static void print_all(){
        // loop through and print all students in the myRoster array
        for(int s = 0; s < myRoster.size(); s++){
            myRoster.get(s).print();
        }
    }
    
    // correctly prints a student's average grade by student ID    
    public static void print_average_grade(String studentId) {
     System.out.println("Print Average Grades:");
        for (Student s : myRoster) {
            if (s.getID().equals(studentId)){
                int average = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2])/3;
                System.out.println("Student ID:\t" + studentId + "\tAverage Grade:\t" + average);
            }
       }        
    }
    
    // verifies student e-mail addresses and displays all invalid e-mail addresses to the user
    public static void print_invalid_emails() { 
        String at = "@";
        String period = ".";
        String space = " ";
        boolean valid = false;
        System.out.println("Email Check:");
        for(Student s : myRoster){
            if (s.getEmail().contains(at) && s.getEmail().contains(period) && s.getEmail().contains(space) == false) {
                valid = true;
            } 
            else {
                System.out.println(s.getEmail() + "\tis an invalid email address");
            }     
        }
    }
   

} // end of Roster class
