package package2;

import package1.User;

public class UserImpl  extends User {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        user.displayProtected();
    }
}
