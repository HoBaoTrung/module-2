package KiemTraCuoiModule2;

import static KiemTraCuoiModule2.App.scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StudentManager implements IManager {
    private static final String STUDENT_FILE = "KiemTraCuoiModule2/data/students.csv";
    private static final String BATCH_FILE = "KiemTraCuoiModule2/data/batchs.csv";

    private static boolean isUniquePhoneNumber(String phone) {
        try {
            List<String> existingPhones = Files.readAllLines(Paths.get(STUDENT_FILE));
            return existingPhones.stream().noneMatch(line -> line.contains("," + phone + ","));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }


    private static boolean isValidClassId(String classId) {

        try {
            Set<String> existingClasses = new HashSet<>(Files.readAllLines(Paths.get(BATCH_FILE)));
            classId = classId.trim();
            String finalClassId = classId;
            if (existingClasses.stream().anyMatch(line -> line.startsWith(finalClassId + ","))) {
                return true;
            } else {
                System.out.println("Mã lớp học không tồn tại, vui lòng nhập lại!");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public void add() {
        try {
            String newId = SinhVien.getQuantity() + 1 + "";
            String name = InputInfo.inputName();
            String gender = InputInfo.inputGender();
            String phoneNumber;
            String birthDate = InputInfo.inputDOB();
            do {
                phoneNumber = InputInfo.inputPhoneNumber();
                if (isUniquePhoneNumber(phoneNumber)) {
                    break;
                }
                System.out.println("Số điện thoại đã tồn tại");
            } while (true);

            String classId;
            do {
                classId = InputInfo.inputClassID();
                if (isValidClassId(classId)) {
                    break;
                }
            } while (true);
            saveStudentToFile(newId + "", name, birthDate, gender, phoneNumber, classId);

        } catch (IOException e) {
            System.out.println("Lỗi thao tác file: " + e.getMessage());
        }
    }

    private static void saveStudentToFile(String id, String name, String birthDate, String gender, String phone, String classId) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(STUDENT_FILE, true))) {
            bw.write(id + "," + name + "," + birthDate + "," + gender + "," + phone + "," + classId);
            bw.newLine();
        }
        SinhVien.setQuantity(Integer.parseInt(id));
    }

    @Override
    public void remove() {
        while (true) {
            try {
                System.out.print("Nhập ID sinh viên cần xóa: ");
                int studentId = Integer.parseInt(scanner.nextLine().trim());
                List<String> lines = Files.readAllLines(Paths.get(STUDENT_FILE));
                boolean found = false;

                for (String line : lines) {
                    if (line.startsWith(studentId + ",")) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    throw new NotFoundStudentException("Sinh viên không tồn tại.");
                }
                do {
                    System.out.print("Bạn có chắc chắn muốn xóa sinh viên này? (Yes/No): ");
                    String confirm = scanner.nextLine().trim();
                    if (confirm.equalsIgnoreCase("Yes")) {
                        lines.removeIf(line -> line.startsWith(studentId + ","));
                        Files.write(Paths.get(STUDENT_FILE), lines);
                        System.out.println("Xóa sinh viên thành công!");
                        break;
                    } else if (confirm.equalsIgnoreCase("No")) {
                        System.out.println("Hủy thao tác xóa. Quay về menu chính.");
                        break;
                    }
                } while (true);
                break;
            } catch (NotFoundStudentException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("Lỗi thao tác file: " + e.getMessage());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID sinh viên phải là số. Vui lòng nhập lại.");
            }
        }
    }

    @Override
    public void show() {
        try {
            List<String> students = Files.readAllLines(Paths.get(STUDENT_FILE));
            Map<String, String> batchMap = loadBatchNames();

            System.out.println("Danh sách sinh viên:");
            for (String student : students) {
                String[] parts = student.split(",");
                if (parts.length < 6) continue;
                String studentId = parts[0];
                String studentName = parts[1];
                String birthDate = parts[2];
                String gender = parts[3];
                String classId = parts[5];
                String className = batchMap.getOrDefault(classId, "N/A");

                System.out.println(studentId + "," + studentName + "," + birthDate + "," + gender + "," + className);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

    public Map<String, String> loadBatchNames() throws IOException {
        List<String> batches = Files.readAllLines(Paths.get(BATCH_FILE));
        Map<String, String> batchMap = new HashMap<>();
        for (String batch : batches) {
            String[] parts = batch.split(",");
            if (parts.length < 2) continue;
            batchMap.put(parts[0], parts[1]);
        }
        return batchMap;
    }

    @Override
    public void search() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String keyword = scanner.nextLine().trim().toLowerCase();

        try {
            List<String> students = Files.readAllLines(Paths.get(STUDENT_FILE));
            Map<String, String> batchMap = loadBatchNames();
            boolean found = false;

            System.out.println("Kết quả tìm kiếm:");

            for (String student : students) {
                String[] parts = student.split(",");
                if (parts.length < 6) continue;
                String studentId = parts[0];
                String studentName = parts[1];
                String birthDate = parts[2];
                String gender = parts[3];
                String classId = parts[5];
                String className = batchMap.getOrDefault(classId, "N/A");

                if (studentName.toLowerCase().contains(keyword)) {
                    System.out.println(studentId + "," + studentName + "," + birthDate + "," + gender + "," + className);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy sinh viên nào phù hợp!");
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

}
