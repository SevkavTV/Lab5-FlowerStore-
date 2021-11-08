package orders;

import users.User;

import java.util.ArrayList;

public class Order {
    public ArrayList<User> users;

    public Order() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers(String status) {
        for (User user: users) {
            user.update(status);
        }
    }

    public boolean order() {
        notifyUsers("Order has been proceed");
        return true;
    }
}
