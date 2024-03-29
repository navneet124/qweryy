package emailApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "anycompany.com";

    //constructor to receive first and last name
    public Email(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;

        //call a method asking for department and return department
        department=setDepartment();

        //call a method that return random password
        password=randomPassword(defaultPasswordLength);
        System.out.println("your password is: "+password);

        //combine elements to generate email
        email = firstname.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    }
    //ask for department
    private String setDepartment() {
        System.out.println("New worker: "+ firstname +", Departement Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }
    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    //change the password
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display name: " + firstname + " " + lastName +
                "\ncompany email: " + email +
                "\nmailbox capacity: " + mailBoxCapacity + "mb";
    }
}
