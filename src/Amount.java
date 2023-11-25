/**
 * The Amount class represents a monetary amount associated with a transaction type.
 */
public class Amount {

    /**
     * The monetary amount of the transaction.
     */
    private double amount;

    /**
     * The type of transaction (e.g., "Deposit" or "Withdrawal").
     */
    private String transactionType;

    /**
     * Constructs a new Amount object with the specified amount and transaction type.
     *
     * @param amount          The monetary amount of the transaction.
     * @param transactionType The type of transaction (e.g., "Deposit" or "Withdrawal").
     */
    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Retrieves the monetary amount of the transaction.
     *
     * @return The monetary amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Retrieves the type of transaction.
     *
     * @return The transaction type (e.g., "Deposit" or "Withdrawal").
     */
    public String getTransactionType() {
        return transactionType;
    }
}