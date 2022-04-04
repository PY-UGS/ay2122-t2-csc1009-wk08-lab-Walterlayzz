import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount: $");
        float amount = input.nextFloat();
        CheckingAccount acc = new CheckingAccount(5000, "234-56789-654");
        acc.deposit(amount);
        System.out.println("Balance after deposit is: $" + acc.getBalance());

        try {
            System.out.print("\n\nEnter amount to withdraw: $");
            float withdrawal = input.nextFloat();
            acc.withdraw(withdrawal);
            System.out.println("The balance after withdrawal is: $" + acc.getBalance());
        }
        catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short of: $" + (e.getAmount() - acc.getBalance()));
        }

    }
}
