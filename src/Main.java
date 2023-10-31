import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


//        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String typeOfAccountCreated = "";

        System.out.println("Welcome to Mini Bank");
        System.out.println("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println( userName + " do you want to open an account? [Y / N] ");
        String openAccount = scanner.nextLine().toLowerCase();

        if(Objects.equals(openAccount, "y")){
            System.out.println("What type of account, checking or savings? [C / S] ");
            String accountType = scanner.nextLine().toLowerCase();
            if(Objects.equals(accountType, "c")){
                System.out.println("....Opening checking account");
                int minAccountNum = 1000000;
                int maxAccountNumber = 9999999;
                int accountNumber = random.nextInt(minAccountNum, maxAccountNumber);
                CheckingsAccount checkingsAccount = new CheckingsAccount(userName,accountNumber ,0);

                System.out.println("Checking account created");

                typeOfAccountCreated = "checking";
                System.out.println("Here is your account details: ");
                System.out.println("Account Holder: " + checkingsAccount.accountHolder);
                System.out.println("Account Number: " + checkingsAccount.accountNumber);
                System.out.println("Account Balance: $" +checkingsAccount.balance);

            } else if (Objects.equals(accountType, "s")){
                System.out.println("....Opening savings account");
                int minAccountNum = 1000000;
                int maxAccountNumber = 9999999;
                int accountNumber = random.nextInt(minAccountNum, maxAccountNumber);
                SavingsAccount savingsAccount = new SavingsAccount(userName,accountNumber ,0);

                System.out.println("Savings account created");

                typeOfAccountCreated = "saving";
                System.out.println("Here is your account details: ");
                System.out.println("Account Holder: " + savingsAccount.accountHolder);
                System.out.println("Account Number: " + savingsAccount.accountNumber);
                System.out.println("Account Balance: $" + savingsAccount.balance);

            } else {
                System.out.println("No account opened");
            }
            }

           if(Objects.equals(typeOfAccountCreated, "checking")){
               System.out.println("Do you want also want to open a savings account? [Y / N ]");
               String openChecking = scanner.nextLine().toLowerCase();

               if(Objects.equals(openChecking, "y")){
                   System.out.println("....Opening savings account");
                   int minAccountNum = 1000000;
                   int maxAccountNumber = 9999999;
                   int accountNumber = random.nextInt(minAccountNum, maxAccountNumber);
                   SavingsAccount savingsAccount = new SavingsAccount(userName,accountNumber ,0);

                   System.out.println("Savings account created");

                   System.out.println("Here is your account details: ");
                   System.out.println("Account Holder: " + savingsAccount.accountHolder);
                   System.out.println("Account Number: " + savingsAccount.accountNumber);
                   System.out.println("Account Balance: $" + savingsAccount.balance);

               } else {
                   System.out.println("Second account not opened");
               }


           } else if (Objects.equals(typeOfAccountCreated, "saving")) {
               System.out.println("\n");
               System.out.println("Do you want also want to open a checking account? [Y / N ]");
               String openSaving = scanner.nextLine().toLowerCase();

               if (Objects.equals(openSaving, "y")){
                   System.out.println("....Opening checking account");
                   int minAccountNum = 1000000;
                   int maxAccountNumber = 9999999;
                   int accountNumber = random.nextInt(minAccountNum, maxAccountNumber);
                   CheckingsAccount checkingsAccount = new CheckingsAccount(userName,accountNumber ,0);

                   System.out.println("Checking account created");

                   System.out.println("Here is your account details: ");
                   System.out.println("Account Holder: " + checkingsAccount.accountHolder);
                   System.out.println("Account Number: " + checkingsAccount.accountNumber);
                   System.out.println("Account Balance: $" +checkingsAccount.balance);
               }

           }

           /*greet in main*/
          /*saving.setUpAccount  checking.setUpAccount*/
         /**/


           // Thank you for joining mini bank
           // What would you like to do?
        // withdraw , deposit, set up bill payment
        // from which account would you like to {action}



        }
}