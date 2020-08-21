package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){

        List<Account> accounts = new LinkedList<Account>();

        //read a csv file and create new accounts based on that data
        String file = "D:\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " "+ sSN+" "+ accountType+" "+initDeposit);
            if(accountType.equals("Savings")){
                System.out.println("Open a Savings Account");
                accounts.add(new Savings(name,sSN,initDeposit));
            }
            else if(accountType.equals("Checking")){
                System.out.println("Open a Checking Account");
                accounts.add(new Checking(name,sSN,initDeposit));
            }
            else{
                System.out.println("Error Reading Account type");
            }
        }
        //accounts.get(5).showInfo();
        for(Account acc : accounts){
            System.out.println("\n********************");
            acc.showInfo();
        }
    }
}
