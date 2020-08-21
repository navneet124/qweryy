package studentdatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses="";
    private int tutionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor prompts user to enter student name and year
    public Student(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter Student first name: ");
        this.firstname=in.nextLine();

        System.out.println("enter Student last name: ");
        this.lastName=in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Senior\nenter Student class level: ");
        this.gradeYear=in.nextLine();

        setStudentId();

        //System.out.println(firstname+" "+lastName+" "+gradeYear+" "+studentId);


    }
    //generate an id
    private void setStudentId(){
        //grade level + ID
        id++;
        this.studentId = gradeYear+""+id;
    }

    //enroll in courses
    public void enroll(){
        //get inside a loop
        while(1!=0) {
            System.out.println("enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else{
            break;}
        }//while(1!=0);
        //System.out.println("Enrolled in: "+courses);
        // System.out.println("Tuition balance: "+tutionBalance);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your Balance is: "+tutionBalance);
    }

    //pay tution
    public void payTution(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in =new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance-payment;
        System.out.println("Thank you for your payment of $"+ payment);
        viewBalance();
    }

    //show status

    @Override
    public String toString() {
        return "Name: " + firstname + " " + lastName +
                "\nGrade Level: "+ gradeYear +
                "\n Student ID: "+studentId+
                "\ncourses: " + courses +
                "\ntutionBalance: " + tutionBalance;
    }
}
