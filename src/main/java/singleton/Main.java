package singleton;

public class Main {
    public static void main(String[] args) {
        singleton.User user = new singleton.User(1, "Yaroslav", "ya.prytula", 18);
        user.save();
    }
}
