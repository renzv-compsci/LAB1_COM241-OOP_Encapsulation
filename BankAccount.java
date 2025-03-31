/*Write a Java program to create a class called BankAccount with 
 * private instance variables accountNumber and balance. Provide 
 * public getter and setter methods to access and modify these variables
 */

public class BankAccount {
    // private instance
    private int accountNumber;
    private double balance;

    // setter methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter methods 
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main (String[] args){

        BankAccount bankInfo = new BankAccount();
        
        // set info 
        bankInfo.setAccountNumber(20241023);
        bankInfo.setBalance(1500);

        System.out.println("Bank Info:");
        System.out.println("Account Number: " + bankInfo.getAccountNumber());
        System.out.println("Balance PHP: " + bankInfo.getBalance());
    }
}