import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        PersonalAccount user1 = new PersonalAccount(220104008, "Kesha");
        PersonalAccount user2 = new PersonalAccount(220104002, "Adilet");
        try {
            user1.deposit(300);
            user1.withdraw(100);
            user1.withdraw(300);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        user1.printTransactionHistory();
    }
}