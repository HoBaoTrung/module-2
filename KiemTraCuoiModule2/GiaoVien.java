package KiemTraCuoiModule2;

import java.util.Date;

public class GiaoVien extends Person{
    public GiaoVien(String id, String name, String birthDate, String gender, String phoneNumber) {
        super(id, name, birthDate, gender, phoneNumber);
    }

    @Override
    public String toString() {
      return "Giáo viên: " + id + ", " + name + ", " + birthDate + ", " + gender + ", " + phoneNumber;
    }

}
