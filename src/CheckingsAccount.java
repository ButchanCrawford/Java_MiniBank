public class CheckingsAccount {
    // attributes

    String accountHolder;
    int accountNumber;
    double balance;



    // constructor

    CheckingsAccount(String accountHolder, int accountNumber , double balance){
        this.accountHolder =accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // methods
    void deposit(double depositAmt){
        this.balance =  this.balance + depositAmt;
        System.out.println("Your new balance is: "  + this.balance);
    }

    void withdraw(double withdrawAmt){
        this.balance =  this.balance + withdrawAmt;
        System.out.println("Your new balance is: "  + this.balance);
    }

    void setUpRecurringPayments(String makePaymentTo, double amtToBePayed){
        this.balance = this.balance - amtToBePayed;
        System.out.println("Feature not yet available");
//        System.out.println("Your payment of " + amtToBePayed + " has been processed");
//        System.out.println("Your new balance is: "  + this.balance);
    }



}
