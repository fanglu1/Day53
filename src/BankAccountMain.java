import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> list = new ArrayList<>();
        BankAccount account1 = new BankAccount(5000, "Fang", 1);
        BankAccount account2 = new BankAccount(4000, "Joe", 2);
        BankAccount account3 = new BankAccount(1000000, "Nick", 3);
        list.add(account1);
        list.add(account2);
        list.add(account3);
        System.out.println("Welcome to Fang's Bank!");
        System.out.println("Are you an existing customer? Yes or No.");

        while (true) {
            String exist = input.nextLine();
            if (exist.equalsIgnoreCase("yes")) {
                mainMenu(existingAccount(list), list);
                break;
            } else if (exist.equalsIgnoreCase("no")) {
                BankAccount newAccount = new BankAccount();
                newAccount.setNewAcctNum(list.size()+1);
                list.add(newAccount);
                mainMenu(newAccount, list);
                break;
            }
        }
    }

    public static BankAccount existingAccount(ArrayList<BankAccount> list) {
        Scanner input = new Scanner(System.in);
        int selectedAccount = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        while (true) {
            System.out.println("Select account number");
            int num = input.nextInt();
            if (num <= list.size() && num >= 1) {
                selectedAccount = num - 1;
                break;
            } else {
                System.out.println("Not valid account number.");
            }
        }
        return list.get(selectedAccount);
    }

    public static void mainMenu(BankAccount selectedAccount, ArrayList<BankAccount> list) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("Hello " + selectedAccount.getName());
        System.out.println("""        
                Welcome to the Main Menu. Choose an option below.
                1. Check balance.
                2. Withdraw cash.
                3. Deposit cash.
                4. Make a transfer to another account.
                0. Exit menu.""");
        int option = input.nextInt();

            if (option == 1) {
                System.out.println("The balance is: " + selectedAccount.getBalance());
            }
            if (option == 2) {
                System.out.println("How much do you want to withdraw?");
                double withdrawAm = input.nextDouble();
                selectedAccount.withdrawal(withdrawAm);
            }
            if (option == 3) {
                System.out.println("How much do you want to deposit?");
                double depositAmt = input.nextDouble();
                selectedAccount.deposit(depositAmt);
            }
            if (option == 4) {
                System.out.println("How much do you want to transfer?");
                double transferAmt = input.nextDouble();
                System.out.println("Who you sending money to?");
                BankAccount recipient = existingAccount(list);
                selectedAccount.transfer(recipient, transferAmt);
                System.out.println("Sender Account Balance: " + selectedAccount.getBalance());
                System.out.println("Recipient account balance: " + recipient.getBalance());
            }
            if (option == 0) {
                break;
            }
        }
    }


    }

