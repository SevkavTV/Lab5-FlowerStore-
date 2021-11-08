package users;

public class UserID {
    private static int currentID = 0;

    public static int generateID() {
        return ++currentID;
    }
}
