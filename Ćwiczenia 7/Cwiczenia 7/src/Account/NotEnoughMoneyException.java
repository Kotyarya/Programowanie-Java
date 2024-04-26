package Account;

public class NotEnoughMoneyException extends Exception {


    public NotEnoughMoneyException() {
        super("Not enough money in your account");
    }
}
