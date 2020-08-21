package bankAccountApp;

public class Checking extends Account{
    //list properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //constructor to initialise checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2"+accountNumber;
       setDebitcard();

    }
    @Override
    public void setRate(){
        rate=getBaseRate()*0.15;
    }

    private void setDebitcard(){
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        debitCardPin = (int)(Math.random()*(Math.pow(10,4)));
    }
    @Override
    public void showInfo() {
        System.out.println("Account Type: Checking");
        super.showInfo();
        System.out.println(
                " Your checking Account Features" +
                        " \n Debit card number: "+ debitCardNumber+
                        "\n Debit card pin: "+ debitCardPin
        );
    }

    //list any method specific to checking account
}
