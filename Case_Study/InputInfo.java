package Case_Study;

import static Case_Study.App.sc;
public abstract class InputInfo {
    
    static String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại:");
            phoneNumber = sc.nextLine();
            if (!Validator.PhoneValidator(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ! Vui lòng nhập lại (VD: 0912345678 hoặc +84912345678)");
            }
        } while (!Validator.PhoneValidator(phoneNumber));
        return phoneNumber;
    }

    static String inputEmail() {
        String email;
        do {
            System.out.print("Nhập email:");
            email = sc.nextLine();
            if (!Validator.EmailValidator(email)) {
                System.out.println("Email không hợp lệ! Vui lòng nhập lại (VD: user@example.com)");
            }
        } while (!Validator.EmailValidator(email));
        return email;
    }

    static String inputDOB(){
        String dateOfBirth;
        do {
            System.out.print("Nhập ngày sinh (dd/mm/yyyy, trước 2020):");
            dateOfBirth = sc.nextLine();
            if (!Validator.DateValidator(dateOfBirth)) {
                System.out.println("Ngày sinh không hợp lệ! Vui lòng nhập lại (VD: 15/12/2019)");
            }
        } while (!Validator.DateValidator(dateOfBirth));
        return dateOfBirth;
    }

    static String inputGender(){
        String gender;
        do {
            System.out.println("Chọn giới tính:");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.print("Nhập lựa chọn (1 hoặc 2): ");
            String c = sc.nextLine();
            if ("1".equals(c)) {
                gender = "Nam";
                break;
            } else if ("2".equals(c)) {
                gender = "Nữ";
                break;
            } else {
                System.out.print("Lựa chọn không hợp lệ! Vui lòng chọn 1 hoặc 2.");
            }
        } while (true);
        return gender;
    }

    static String inputGroup() {
        do{
            System.out.print("Nhập nhóm:");
            String group = sc.nextLine();
            if(group.isEmpty()){
                System.out.println("Yêu cầu nhập nhóm");
            }else{
                return group;
            }
        }while (true);

    }

    static String inputName() {
        do {
            System.out.print("Nhập họ tên:");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                System.out.println("Yêu cầu nhập họ tên");
            }else return name;
        }
        while (true);
    }

    static String inputAddress() {
        do{
            System.out.println("Nhập địa chỉ:");
            String address = sc.nextLine();
            if (address.isEmpty()) {
                System.out.println("Yêu cầu nhập địa chỉ");
            }else return address;
        }while (true);

    }
}
