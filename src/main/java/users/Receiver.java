package users;

import static users.UserID.generateID;

public class Receiver implements User{
    private int id;

    public Receiver() {
        this.id = generateID();
    }

    @Override
    public String update(String status) {
        return "Your status as receiver is " + status;
    }

    public int getId() {
        return id;
    }
}
