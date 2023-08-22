import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter the agency number: ");
        String agencyNumber = scanner.next();

        System.out.print("Enter account holder: ");
        String accountHolder = scanner.next();
        scanner.next();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        System.out.printf("Hello %s, thank you for creating an account at our bank, your branch is %s, account %s and your balance U$%.2f is now available for withdrawal", accountHolder, agencyNumber, accountNumber, balance);
    }
}