
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String name;
    private double acctNum;
    Scanner input = new Scanner(System.in);

    public BankAccount (double balance, String name, double acctNum) {
        this.balance = balance;
        this.name = name;
        this.acctNum = acctNum;
    }
    public BankAccount () {
        System.out.println("What is the name for the account?");
        String name = input.nextLine();
        System.out.println("What is the beginning balance for the account?");
        double balance = input.nextDouble();
        this.name = name;
        this.balance = balance;
    }
    public void setNewAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }
    public double deposit(double dep) {
        balance += dep;
        return dep;
    }
    public String getName() {
        return this.name;
    }
    public double getBalance() {
        return this.balance;
    }

    public double withdrawal(double with) {
        balance -= with;
        return with;
    }
    public double transfer(BankAccount recipient, double money) {
        return recipient.deposit(this.withdrawal(money));
    }
    public String toString() {
        return "Account Number: " + this.acctNum + " Name: " + this.name + " Balance: " + this.balance;
    }

}
