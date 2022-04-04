public class CheckingAccount {
    private float balance;
    private String account;

    public CheckingAccount(float balance, String account) {
        this.balance = balance;
        this.account = account;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        else {
            balance -= amount;
        }
    }
}
