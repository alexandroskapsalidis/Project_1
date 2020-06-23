
package projectparta;

import java.util.ArrayList;

public class AssignmentsPerStudent {
    private Student student;
    private ArrayList <Assignment> assignmentsPerStudent;
    
    
    public AssignmentsPerStudent (Student student, ArrayList <Assignment> assignmentsPerStudent ) {
        this.student=student;
        this.assignmentsPerStudent = assignmentsPerStudent;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setAssignmentsPerStudent(ArrayList<Assignment> assignmentsPerStudent) {
        this.assignmentsPerStudent = assignmentsPerStudent;
    }

    public Student getStudent() {
        return student;
    }

    public ArrayList<Assignment> getAssignmentsPerStudent() {
        return assignmentsPerStudent;
    }
    
    public void printInfo () {
        System.out.println("Student:");
        this.student.printInfo();
        System.out.println("Has the Assignments:");
        for (Assignment as:this.assignmentsPerStudent)
            as.printInfo();
        }
    
}



