//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class BankAccount
{
    private String AccountNumber;
    private double balance;
     public BankAccount(String AccountNumber,double initaldeposit)
    {
        AccountNumber=AccountNumber;
        balance=initaldeposit;
    }
     public BankAccount(String AccountNumber)
    {
        AccountNumber=AccountNumber;
        balance=0.0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited :" + amount);
        } else {
            System.out.println("Invaild amount please try again");
        }
    }
    public Void withdraw(double amount){

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn :" + amount);
        } else {
            System.out.println("No sufficent balance in you Account");
        }
    }
    public void display(){

    System.out.println("Account number:"+AccountNumber);
    System.out.println("Balance:"+balance);
}
    public static void main (String[] args) {
    BankAccount acc1 = new BankAccount("ACC001", 10000.0);
    acc1.deposit(5000);
    acc1.withdraw(7000);
    acc1.display();
    System.out.println();
    BankAccount acc2 = new BankAccount("ACC002");
    acc2.deposit(2000);
    acc2.withdraw(500);
    acc2.display();
}

}