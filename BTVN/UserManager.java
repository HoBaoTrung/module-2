package BTVN;

public class UserManager {
    public User[] list;
    public int limit;

    public UserManager(int limit) {
        this.limit = limit;
        list = new User[0];
    }

    public void addUser(User user) {
        int totalCurrentUser = list.length;
        if (totalCurrentUser < limit) {
            User[] newList = new User[totalCurrentUser + 1];
            for (int i = 0; i < totalCurrentUser; i++) {
                newList[i] = list[i];
            }
            newList[totalCurrentUser] = user;
            list = newList;
        }else System.out.println("UserManager is full");
    }

    public void showListUsers() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {break;}
            System.out.println(list[i].getInfo());
        }
    }

    public void editUser(int id, User newUser) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].id == id) {
                list[i] = newUser;
                return;
            }
        }
        System.out.println("User not found");
    }

    public void removeUser(int id) {
        boolean found = false;
        int currentSize = list.length;
        for (int i = 0; i < currentSize; i++) {
            if (list[i].id == id) {
                found = true;
                // Dịch chuyển các phần tử sau vị trí cần xóa lên một vị trí
                for (int j = i; j < currentSize - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[currentSize - 1] = null; // Xóa phần tử cuối
                currentSize--;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found");
        }
    }
}
