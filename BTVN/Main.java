package BTVN;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager(3);
        for (int i = 1; i <= 5; i++) {
            User u = new User(i, "user"+i, "user"+i+"@gmail.com", 20+i);
            userManager.addUser(u);
        }
        userManager.showListUsers();
        User editUser = new User(2, "editUser", "editUser@gmail.com", 20+1);
        userManager.editUser(2, editUser);
        userManager.showListUsers();
        userManager.removeUser(2);
        userManager.showListUsers();
    }
}
