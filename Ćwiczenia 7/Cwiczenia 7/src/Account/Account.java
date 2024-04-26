package Account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Account {

    private String owner;
    private int balance;
    private int accountNumber;


    public void transfer(int balance) throws NotEnoughMoneyException {
        if (balance > this.balance) {
            throw new NotEnoughMoneyException();
        } else {
            this.balance -= balance;
        }
    }
}
