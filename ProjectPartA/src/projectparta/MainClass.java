package projectparta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        int choiceMenu = 1;
        while (choiceMenu != 0) {
            System.out.println("Welcome!");
            System.out.println("Press 1 to Subscribe a Student to a Course");
            System.out.println("Press 2 to Print all the Students");        
            System.out.println("Press 3 to Print all the Courses");        
            System.out.println("Press 4 to Print all the Trainers");      
            System.out.println("Press 5 to Print all the Assignments");      
            System.out.println("Press 6 to Print all the Java Students");      
            System.out.println("Press 7 to Print all the C# Students");      
            System.out.println("Press 8 to Print all the Java Trainers");      
            System.out.println("Press 9 to Print all the C# Trainers");      
            System.out.println("Press 10 to Print all the Java Assignments"); 
            System.out.println("Press 11 to Print all the C# Assignments");
            System.out.println("Press 12 to Print all the Assignments per Student");
                        
            System.out.println("Press 0 to Exit this Menu");            
            
            choiceMenu = sc.nextInt();

            ArrayList<Student> allStudents = new ArrayList<>();
            ArrayList<Course> courses = new ArrayList<>();
            ArrayList<Student> javaStudents = new ArrayList<>();
            ArrayList<Student> cSharpStudents = new ArrayList<>();
            ArrayList<Trainer> allTrainers = new ArrayList<>();
            ArrayList<Trainer> javaTrainers = new ArrayList<>();
            ArrayList<Trainer> cSharpTrainers = new ArrayList<>();
            ArrayList<Assignment> allAssignments = new ArrayList<>();
            ArrayList<Assignment> javaAssignments = new ArrayList<>();
            ArrayList<Assignment> cSharpAssignments = new ArrayList<>();            
            ArrayList<Assignment> assignmentsPerStudent = new ArrayList<>();            

            switch (choiceMenu) {
                case 1:
                    // Stoixeia Student
                    System.out.println("Give the Name of the Student:");
                    String fname = sc.next();
                    System.out.println("Give the Surname of the Student:");
                    String lname = sc.next();
                    System.out.println("Give the Date of Birth (dd/MM/yyyy):");
                    String birthDate = sc.next();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateOfBirth = dateFormat.parse(birthDate);                     // Date of birth
                    System.out.println("Give the Tuition Fees: ");
                    double tuitionFees = sc.nextDouble();

                    // Stoixeia Course
                    //tittle
                    System.out.println("Give the Tittle of the Course: ");
                    System.out.println("Press 1 for Java Course");
                    System.out.println("Press 2 for C# Course");
                    String tittleCourse = "";
                    int tittleC = sc.nextInt();
                    switch (tittleC) {
                        case 1:
                            tittleCourse = "Java";
                            break;
                        case 2:
                            tittleCourse = "C#";
                            break;
                        default:
                            System.out.println("Invalid Number!");
                            break;
                    }
                    //type
                    System.out.println("Give the Type of the Course: ");
                    System.out.println("Press 1 for Full Time");
                    System.out.println("Press 2 for Part Time");
                    String typeCourse = "";
                    int typeC = sc.nextInt();
                    switch (typeC) {
                        case 1:
                            typeCourse = "Full Time";
                            break;
                        case 2:
                            typeCourse = "Part Time";
                            break;
                        default:
                            System.out.println("Invalid Number!");
                            break;
                    }

                    System.out.println("Give the start date of the course (dd/MM/yyyy): ");
                    String startDate = sc.next();
                    SimpleDateFormat startDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date start_date = dateFormat.parse(startDate);                         // start date of the course

                    System.out.println("Give the end date of the course (dd/MM/yyyy): ");
                    String endDate = sc.next();
                    SimpleDateFormat endDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date end_date = dateFormat.parse(startDate);                            // end date of the course

                    //dimiourgia student kai course
                    Student st = new Student(fname, lname, dateOfBirth, tuitionFees); // dimioyrgia Student
                    Course course = null;

                    // prosthiki tou student sti lista allStudents
                    allStudents.add(st);

                    // prosthiki students per course
                    if (tittleCourse.equals("Java")) {
                        javaStudents.add(st);
                        course = new Course(tittleCourse, typeCourse, start_date, end_date, javaStudents);
                    } else if (tittleCourse.equals("C#")) {
                        cSharpStudents.add(st);
                        course = new Course(tittleCourse, typeCourse, start_date, end_date, cSharpStudents);
                    }

                    // prosthiki tou course sti lista courses                   
                    courses.add(course);

                    // dimiourgia trainer          
                    // 
                    System.out.println("Adding the Trainers of the Course");
                    System.out.println("Give the First Name of the Trainer:");
                    String firstName = sc.next();
                    System.out.println("Give the Second Name of the Trainer:");
                    String lastName = sc.next();
                    System.out.println("Give the Subject of the Trainer:");
                    String subject = sc.next();
                    Trainer trainer = new Trainer(firstName, lastName, subject); // Dimioyrgeia Trainer 

                    // prosthiki tou trainer sth lista alltrainers
                    allTrainers.add(trainer);

                    // prosthiki trainers per course
                    if (tittleCourse.equals("Java")) {
                        javaTrainers.add(trainer);
                        course.setTrainers(javaTrainers);
                    } else if (tittleCourse.equals("C#")) {
                        cSharpTrainers.add(trainer);
                        course.setTrainers(cSharpTrainers);
                    }

                    // dimiourgia Assignment          
                    // 
                    System.out.println("Adding the Assignment of the Course");
                    System.out.println("Give the Tittle of the Assignment");
                    String tittle = sc.next();
                    System.out.println("Give the Description of the Assignment");
                    String description = sc.next();
                    
                    // Submission Date and finding the day of the week
                    int dayOfWeek = 1;
                    Date subDateTime = null;
                    while ((dayOfWeek == 1) || (dayOfWeek == 7)) {
                        System.out.println("Give the Submission Date of the Assignment (dd/MM/yyyy)");
                        System.out.println("It must be a Week Day not Weekend!");
                        String subDate = sc.next();
                        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
                        subDateTime = dateForm.parse(subDate); 
                        Calendar c = Calendar.getInstance();
                        c.setTime(subDateTime);
                        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);                    
                    }
                  
                    Assignment assignment = new Assignment (tittle, description, subDateTime); // Dimioyrgeia Assignment 
                    allAssignments.add(assignment);
                    
                    // prosthiki Assignment per course
                    if (tittleCourse.equals("Java")) {
                        javaAssignments.add(assignment);                       
                    } else if (tittleCourse.equals("C#")) {
                        cSharpAssignments.add(assignment);                        
                    }                  
                    
                    // prosthiki Assignment per student
                    st.setAssignment(assignment);                   
                    
                    break;
                    
                case 2:                    
                    for (Student s: allStudents )
                         s.printInfo();
                    break;
                    
                case 3:                    
                    for (Course c: courses )
                         c.printInfo();   
                    break;
                    
                case 4:                    
                    for (Trainer t: allTrainers )
                         t.printInfo();   
                    break;    
                    
                case 5:                    
                    for (Assignment as: allAssignments )
                         as.printInfo();   
                    break;     
                    
                case 6:                    
                    for (Student s: javaStudents )
                         s.printInfo();   
                    break;    
                    
                case 7:                    
                    for (Student s: cSharpStudents )
                         s.printInfo();   
                    break;      
                    
                case 8:                    
                    for (Trainer t: javaTrainers )
                         t.printInfo();   
                    break;       
                    
                case 9:                    
                    for (Trainer t: cSharpTrainers )
                         t.printInfo();   
                    break; 
                
                case 10:                    
                    for (Assignment as: javaAssignments )
                         as.printInfo();   
                    break; 
                    
                case 11:                    
                    for (Assignment as: cSharpAssignments )
                         as.printInfo();  
                    break;
                    
                case 12:                    
                    System.out.println("Give the Name of the Student ");
                    String name = sc.next();
                    System.out.println("Give the LastName of the Student ");
                    String name2 = sc.next();                 
                    AssignmentsPerStudent asPer = null;
                    for (Student s: allStudents) 
                        if ((s.getFirstName().contentEquals(name)) && (s.getLastName().contentEquals(name2))) {
                            asPer = new AssignmentsPerStudent(s,s.getAssignments());
                            for (Assignment asP: asPer.getAssignmentsPerStudent())
                               asPer.printInfo();                           
                    }
                                       
                    break;
                default:
                    System.out.println("Invalid Number");
                                      
                } 
                           
            }
            sc.close();
        
    }

}
