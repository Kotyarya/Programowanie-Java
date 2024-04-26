import Account.*;
import Animals.*;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("User", 100, 5372);



        try {
            account.transfer(200);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Your balance : " + account.getBalance());
        }
    }
}