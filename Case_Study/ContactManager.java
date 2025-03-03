package Case_Study;

import java.io.*;
import java.util.*;

import static Case_Study.App.sc;

public class ContactManager implements Manager<Contact> {
    private List<Contact> contacts;
    private static final String FILE_NAME = "Case_Study/data/contacts.csv";
    private static final String WRITE_FILE_NAME = "Case_Study/data/write_contacts.csv";
    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public boolean isUniquePhoneNumber(String phoneNumber) {
        return contacts.stream().noneMatch(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }

    public boolean isUniqueEmail(String email) {
        return contacts.stream().noneMatch(contact -> contact.getEmail().equals(email));
    }

    // Thêm liên hệ mới
    @Override
    public boolean add(Contact contact) {
        System.out.println(contact);
        while (!isUniquePhoneNumber(contact.getPhoneNumber())) {
            System.out.println("Số điện thoại đã tồn tại");
            System.out.println("Vui lòng nhập lại");
            contact.setPhoneNumber(InputInfo.inputPhoneNumber());
        }
        while (!isUniqueEmail(contact.getEmail())) {
            System.out.println("Email đã tồn tại");
            System.out.println("Vui lòng nhập lại");
            contact.setEmail(InputInfo.inputEmail());
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
        return true;
    }

    @Override
    public boolean addAll(List<Contact> newContacts) {
        for (Contact contact : newContacts) {
            add(contact);
        }
        return true;
    }

    // Xóa liên hệ bằng số điện thoại
    @Override
    public boolean remove() {
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        if (phoneNumber.isEmpty()) {
            return false;
        }
        System.out.println(searchByPhoneNumber(phoneNumber));
        System.out.print("Bạn chắc chắn muốn xóa (y/N): ");
        do {
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                return contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
            } else if (choice.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.print("Nhập y hoặc N: ");
            }
        } while (true);

    }

    // Tìm kiếm liên hệ bằng số điện thoại
    public Contact searchByPhoneNumber(String phoneNumber) {

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    // Tìm kiếm gần đúng theo số điện thoại hoặc họ tên
    public List<Contact> searchFuzzy(String keyword) {
        List<Contact> result = new ArrayList<>();

        // Chuyển keyword về chữ thường để tìm kiếm không phân biệt hoa thường
        keyword = keyword.toLowerCase();

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().contains(keyword) || contact.getName().toLowerCase().contains(keyword)) {
                result.add(contact);
            }
        }

        return result;
    }

    @Override
    public boolean update() {
        int findIndex;
        Contact findContact;
        do {
            System.out.print("Nhập số điện thoại: ");
            String phoneNumber = sc.nextLine();
            if (phoneNumber.isEmpty()) {
                return false;
            }
            findContact = searchByPhoneNumber(phoneNumber);
            if (findContact == null) {
                System.out.println("Không tìm được danh bạ với số điện thoại trên. Vui lòng nhập lại");
            } else break;
        } while (true);
        System.out.println(findContact);
        findIndex = contacts.indexOf(findContact);
        outerloop:
        do {
            System.out.println("---MENU CHỈNH SỬA---");
            System.out.println("1. Nhóm danh bạ\n2. Họ tên\n3. Giới tính\n4. Ngày sinh\n5. Email\n6. Thoát");
            System.out.print("Lựa chọn: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {

                case 1:
                    findContact.setGroup(InputInfo.inputGroup());
                    break;

                case 2:
                    findContact.setName(InputInfo.inputName());
                    break;
                case 3:
                    findContact.setSex(InputInfo.inputGender());
                    break;
                case 4:
                    findContact.setDateOfBirth(InputInfo.inputDOB());
                    break;
                case 5:
                    String email = InputInfo.inputEmail();
                    while (!isUniqueEmail(email)) {
                        System.out.println("Email đã tồn tại");
                        System.out.println("Vui lòng nhập lại");
                        email = InputInfo.inputEmail();
                    }
                    findContact.setEmail(InputInfo.inputEmail());
                    break;
                case 6:
                    break outerloop;
                default:
                    System.out.println("Chỉ nhập 1-6");
            }
        } while (true);
        contacts.set(findIndex, findContact);
        return true;
    }

    @Override
    // Hiển thị toàn bộ danh bạ
    public void display() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống!");
            return;
        }

        int index = 0;
        Contact[] contactArray = contacts.toArray(new Contact[0]);

        while (index < contactArray.length) {
            System.out.println("Danh bạ:");
            for (int i = 0; i < 5 && index < contactArray.length; i++, index++) {
                System.out.println((index + 1) + ". " + contactArray[index]);
            }

            if (index < contactArray.length) {
                System.out.println("\n(Nhấn Enter để xem tiếp...)");
                sc.nextLine(); // Đợi Enter để tiếp tục
            }
        }
    }

    @Override
    public void sort() {
        this.contacts.sort(new ContactComparator());
    }


    public void readCSV() {
        System.out.print("Bạn chắc chắn muốn thực hiện cập nhật lại toàn bộ bộ nhớ danh bạ từ file (y/N): ");
        do {
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                contacts.clear();
                String COMMA = ",";
                try {
                    FileReader fileReader = new FileReader(FILE_NAME);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    Scanner scanner = new Scanner(bufferedReader);
                    String line = scanner.nextLine();
                    while (scanner.hasNextLine()) {
                        line = scanner.nextLine();
                        String[] values = line.split(COMMA);
                        Contact contact = new Contact();
                        contact.setPhoneNumber(values[0]);
                        contact.setGroup(values[1]);
                        contact.setName(values[2]);
                        contact.setAddress(values[4]);
                        contact.setSex(values[3]);
                        contact.setDateOfBirth(values[5]);
                        contact.setEmail(values[6]);
                        add(contact);
                    }
                    scanner.close();
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (choice.equalsIgnoreCase("n")) {
                return;
            } else {
                System.out.print("Nhập y hoặc N: ");
            }
        } while (true);


    }

    public void writeCSV() {
        System.out.print("Bạn chắc chắn muốn thực hiện cập nhật lại toàn bộ nội dung file (y/N): ");
        do {
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                String COMMA = ",";
                try {
                    FileWriter fileWriter = new FileWriter(WRITE_FILE_NAME, false);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write("Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email");
                    bufferedWriter.newLine();
                    for (Contact contact : contacts) {
                        bufferedWriter.write(contact.getPhoneNumber() + COMMA + contact.getGroup() + COMMA + contact.getName() + COMMA + contact.getSex()
                        + COMMA + contact.getAddress() + COMMA + contact.getDateOfBirth() + COMMA + contact.getEmail());
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                    System.out.println("Ghi thành công");
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (choice.equalsIgnoreCase("n")) {
                return;
            } else {
                System.out.print("Nhập y hoặc N: ");
            }
        } while (true);

    }

}

