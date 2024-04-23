package Model;
import Model.desing;
import java.util.Scanner;
import java.util.UUID;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    private UUID accountId;
    private double balance;
    private String currency;
    private String status;
    desing d = new desing();

    //@
    public BankAccount() {
        System.out.println("Creating your Bank Account............");
    }

    public BankAccount(UUID accountId, double balance, String currency, String status) {

        if (accountId == null || balance < 0 || currency == null || status == null) {
            System.out.println("Invalid Input");
            }

        else {
            d.errorDesign();
            System.out.println("Your account has been created");
            d.errorDesign();
        }
    }

    public void  printAccount() {
        d.printDesign();
        System.out.println("Account Id : " + this.accountId + "\n");
        System.out.println("Balance : " + this.balance + "\n");
        System.out.println("Currency : " + this.currency + "\n");
        System.out.println("Status : " + this.status + "\n");
        d.printDesign();
    }

    public boolean accountIsNull(BankAccount account){
        if (account == null){
            return false;
        }
        else
            return true;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance() {
        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency() {
        System.out.print("Currency: ");
        currency = sc.next();
    }
    public String getStatus() {
        return status;
    }
    public void setStatus() {
        System.out.print("Status: ");
        this.status = sc.next();
    }



}
