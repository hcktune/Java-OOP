import Model.BankAccount;
import Model.desing;
import java.util.Scanner;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        customer.setAccountId(UUID.randomUUID());
        System.out.println("Enter the following informations to create your account :");
        new desing();
        // read customer infos
        customer.setBalance();
        customer.setCurrency();
        customer.setStatus();
        new desing();
        // print infos
        customer.printAccount();

        System.out.println(customer);
    }
}