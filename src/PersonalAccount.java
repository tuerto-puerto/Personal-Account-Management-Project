import java.util.ArrayList;
/**
 * The PersonalAccount class represents a simple personal bank account with basic
 * functionalities such as deposit, withdrawal, and transaction history.
 */
public class PersonalAccount {
    /**
     * The unique account number associated with this account.
     */
    private int accountNumber;

    /**
     * The name of the account holder.
     */
    private String accountHolder;

    /**
     * The current balance in the account.
     */
    private double balance;

    /**
     * A list of transactions associated with this account.
     */
    private ArrayList<Amount> transactions;

    /**
     * Constructs a new PersonalAccount with the given account number and account holder's name.
     *
     * @param accountNumber The unique account number for this account.
     * @param accountHolder The name of the account holder.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount The amount to be deposited. Must be greater than zero.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(new Amount(amount, "Deposit"));
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    /**
     * Withdraws a specified amount from the account if sufficient funds are available.
     *
     * @param amount The amount to be withdrawn. Must be greater than zero and not exceed the account balance.
     */
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance)
        {
            throw new InsufficientBalanceException("There is not enough money on your balance. Your balance: " + balance);
        }else {
            if (amount > 0 && amount < balance) {
                transactions.add(new Amount(amount, "Withdrawal"));
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }
    }

    /**
     * Prints the transaction history for the account.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + accountNumber + " (" + accountHolder + "):");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves the account number associated with this account.
     *
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieves the name of the account holder.
     *
     * @return The name of the account holder.
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}





