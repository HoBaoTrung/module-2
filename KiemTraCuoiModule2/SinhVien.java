package KiemTraCuoiModule2;

import java.util.Date;

public class SinhVien extends Person {
    private String classId;
    private static int quantity = 0;
    public SinhVien(String id, String name, String birthDate, String gender, String phoneNumber, String classId) {
        super(id, name, birthDate, gender, phoneNumber);
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Sinh viên: " + id + ", " + name + ", " + birthDate + ", " + gender + ", " + phoneNumber + ", " + classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        SinhVien.quantity = quantity;
    }
}
