
package projectparta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private double tuitionFees;
    private Course course;
    private ArrayList <Assignment> assignments;
    
    public Student (String firstName,String lastName, Date dateOfBirth, double tuitionFees) {
        if (firstName.length() != 0) {
            this.firstName = firstName;
        }    
        if (lastName.length() != 0) {
            this.lastName = lastName;
        }
        
        this.dateOfBirth = dateOfBirth;
        
        if (tuitionFees > 0) {
            this.tuitionFees = tuitionFees;
         
        }         
    }

    public void setFirstName(String firstName) {
        if (firstName.length() != 0) {
        this.firstName = firstName;
        }
    }
    public void setLastName(String lastName) {
        if (lastName.length() != 0) {
            this.lastName = lastName;
        }
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setTuitionFees(double tuitionFees) {
        if (tuitionFees > 0) {
            this.tuitionFees = tuitionFees;
        }
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public void setAssignment(Assignment assignment) {
        this.assignments.add(assignment);
    }    
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList getAssignments() {
        return this.assignments;
    }
    
    public void printInfo () {
        Date date = this.dateOfBirth;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = dateFormat.format(date);         
        String year = strDate.substring(6, 10);
        int result = Integer.parseInt(year);       
        int age = 2019 - result;        
        System.out.println("Student' s Name: " +this.firstName +" "+this.lastName);
        System.out.println("Student' s Age: "+ age);
        System.out.println("Student' s Tuition Fees: " + this.tuitionFees);
        System.out.println("Course: ");
        System.out.println("Course Tittle: "+ this.course.getTittle());
        System.out.println("Course Type: "+ this.course.getType());
    }
    
    
}
