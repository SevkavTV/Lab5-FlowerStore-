package users;

import static users.UserID.generateID;

public class Sender implements User{
    private int id;

    public Sender() {
        this.id = generateID();
    }

    @Override
    public String update(String status) {
        return "Your status as sender is " + status;
    }

    public int getId() {
        return id;
    }
}
