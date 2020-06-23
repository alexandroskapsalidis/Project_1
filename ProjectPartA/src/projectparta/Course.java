package projectparta;

import java.util.ArrayList;
import java.util.Date;

public class Course {

    private String tittle;
    private String stream;
    private String type;
    private Date start_date;
    private Date end_date;
    private ArrayList <Student> students;
    private ArrayList <Trainer> trainers;
    private Assignment assignment;
    

    public Course(String tittle, String type, Date start_date,Date end_date, ArrayList <Student> students) {
        if (tittle.length() != 0) {
            this.tittle = tittle;
        }
        if (type.length() != 0) {
            this.type = type;
        }
        this.stream = "CB9";
        this.start_date = start_date;
        this.end_date = end_date; 
        this.students=students;
    }

    public void setTittle(String tittle) {
        if (tittle.length() != 0) {
            this.tittle = tittle;
        }
    }

    public void setType(String type) {
        if (type.length() != 0) {
            this.type = type;
        }
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }   
    
    public String getTittle() {
        return tittle;
    }

    public String getStream() {
        return stream;
    }

    public String getType() {
        return type;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void printInfo () {
        System.out.println("Course Information");
        System.out.println("Stream: "+this.stream);
        System.out.println("Tittle: " + this.tittle);
        System.out.println("Type: " + this.type);
        System.out.println("Starting Date: " + this.start_date);
        System.out.println("Ending Date: " + this.end_date);
    }
    
}
