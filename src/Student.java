/**
 * This program will maintain a roster of students, their info, and grades in a given course
 * @author Cecilia C Constantine
 */

import java.util.Arrays;

public class Student {
    /**
     * instance variables specified in the class declaration NOT the constructor
     * They're private so not just anyone can come in and modify this core data
    */
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;


    /**
     * Constructor that takes parameters to set all of the variables created in Student class
     * How we initialize the data when we allocate memory in the system for a Student object
     * Always public
     * Named exactly the same as the class
    */
    Student (String studentId, String firstName, String lastName, String email, int age, int[] grades) {
        setID(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrades(grades);
    } 

    /**
     * These are the Getters / the Accessors methods
     * Accesses the references of the private instant variables so 
     * people outside the class can know what variables exist
     * @return studentID,firstName, lastName, email, age, grades
     */
    public String getID() {
        return studentId;                         
    }
    public String getFirst() {
        return firstName;
    }
    public String getLast() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public int[] getGrades() {
        return grades;
    }           

    /**
     * These are the Setters / the Mutator methods
     * Public so that others can add/set variables
     * Void because no values will be returned
     * 
     */            

    /** This actually creates it's own variable of which you need to make sure
    * matches the actual instant variable you need
    * think of it like the public face of that private variable
    * "This" keyword = use when variable names are the same
    * easier than thinking up an alternative name for every variable
    * @param studentId
    */ 
    public void setID(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades){
        this.grades = grades;
    }

      /**
       * Prints out entire student record in tab delimited format
       * @returns the student record
        */  
      public void print(){
          System.out.println("Student ID:\t" + getID() +
                  "\tFirst Name:\t" + getFirst() +
                  "\t\tLast Name:\t" + getLast() +
                  "\tEmail:\t" + getEmail() +
                  "\tAge:\t"  + getAge() +
                  "\tGrades:\t" + Arrays.toString(getGrades())
          );
      }

    } // end of Student class
    