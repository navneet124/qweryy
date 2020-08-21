package bankAccountApp;

public class Savings extends Account{
    //list properties specific to Savings account
    private int safetyDepositBoxId;
    private int safteyDepositBoxKey;

    //constructor to initialise Savings account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "1"+accountNumber;
        setSafteyDepositBox();

    }
    @Override
    public void setRate(){
        rate=getBaseRate()-0.25;
    }

    private void setSafteyDepositBox(){
        safetyDepositBoxId = (int)(Math.random()*1000);
        safteyDepositBoxKey = (int)(Math.random()*10000);
    }

    //list any method specific to Savings account
    @Override
    public void showInfo() {
        System.out.println("Account Type: Savings");
        super.showInfo();
        System.out.println(
                " Your savings Account Features" +
                " \n Saftey Deposit Box ID: "+ safetyDepositBoxId+
                "\n Saftey Deposit Box Key: "+ safteyDepositBoxKey
            );
    }



}
