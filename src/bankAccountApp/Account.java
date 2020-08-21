package bankAccountApp;

public abstract class Account implements IBaseRate {
    //list common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //constructor to set base properties and initialise the account
    public Account(String name, String sSN, double initDeposit){
        this.name=name;
        this.sSN=sSN;
        balance=initDeposit;
        this.accountNumber=setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private  String setAccountNumber(){
        String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()* 1000);
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accuredInterest = balance*(rate/100);
        balance=balance+accuredInterest;
        System.out.println("Accured Interest: "+ accuredInterest);
        printBalance();
    }

    //list common methods transactions
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Depositing $" +amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Withdrawing $" +amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance=balance-amount;
        System.out.println("Transferring $" + amount +" to "+ toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now $"+ balance);
    }

    public void showInfo() {
        System.out.println(
                "name= " + name +
                "\nbalance= " + balance +
                "\naccountNumber= " + accountNumber +
                "\nrate= "+rate +"%"
        );
    }
}
