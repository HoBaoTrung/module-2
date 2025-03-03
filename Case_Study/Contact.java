package Case_Study;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;
    private String address;
    private String sex;
    private String group;
    private String email;
    private String dateOfBirth;
    public Contact() {}
    public Contact(String name, String phoneNumber, String address, String sex, String group, String email, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.sex = sex;
        this.group = group;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", group='" + group + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Contact contact = (Contact) o;
//        return Objects.equals(email, contact.email) ||
//                Objects.equals(phoneNumber, contact.phoneNumber);
//    }
//
//    @Override
//    public int hashCode() {
//        int emailHash = (email == null) ? 0 : email.hashCode();
//        int phoneHash = (phoneNumber == null) ? 0 : phoneNumber.hashCode();
//        System.out.println(emailHash);
//        System.out.println(phoneHash);
//        System.out.println(emailHash | phoneHash);
//        // Kết hợp hai hashCode bằng phép OR
//        return emailHash | phoneHash;
// //        return Objects.hash(email, phoneNumber);
//        // return 1;
//    }


}
