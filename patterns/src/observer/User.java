package observer;

import state.Print;
import state.userstates.UserStatus;

import java.util.List;

/**
 * Created by student on 02.04.2017.
 */
public class User {
    private String username;
    private int pin;
    private List<Pool> poolList;
    private double account;
    private UserStatus status;

    public void createPrint(Print print) {
        poolList.get(1).addPrint(this, print);
    }

    public UserStatus getStatus() {
        return status;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
