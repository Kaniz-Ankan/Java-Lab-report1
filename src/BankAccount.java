public class BankAccount {
    private String Account;  //stating the class
    private double balance;

    public BankAccount(String acc, double initialbalance){  //constructor dicchi
        this.Account= acc;
        this.balance= initialbalance;
    }
    //method dibo 3 ta for 1.deposit 2.withdraw 3.display
    public void deposit (double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited Money: $"+amount+"Total Balance: $"+balance);
        }
        else{
            System.out.println("Invalid Deposit.");
            System.out.println("Balance: "+balance);
        }
    }
    public void withdraw(double amount){
        if(amount<=balance && balance!=0){
            balance-=amount;
            System.out.println("Withdrawn Money: $"+amount+"Remain Balance: $"+amount);
        }
        else{
            System.out.println("Amount is exceeding the balance");
            System.out.println("Balance: $"+balance);
        }
    }
    public void displayBankAccount(){
        System.out.println("ACCOUNT NAME: "+Account);
        System.out.println("Account Current Balance: $"+balance);

    }
    public static void main(String[] args){
        BankAccount acc1= new BankAccount("Kaniz123",2000);
        BankAccount acc2 = new BankAccount("Diraz456",5000);
        acc1.displayBankAccount();

     acc1.deposit(400);
     acc1.withdraw(1000);
     acc1.displayBankAccount();

     acc2.displayBankAccount();
     acc2.deposit(200);
     acc2.withdraw(6000);
     acc2.displayBankAccount();


    }
}
