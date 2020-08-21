package studentdatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){


        //ask how many users we want to add
        System.out.println("Enter no of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numofStudents=in.nextInt();
        Student[] students= new Student[numofStudents];

        //create n no of new student
        for(int n=0;n<numofStudents;n++){
            students[n]=new Student();
            students[n].enroll();
            students[n].payTution();
        }
        for(int n=0;n<numofStudents;n++){
            System.out.println(students[n].toString());
        }
    }
}
