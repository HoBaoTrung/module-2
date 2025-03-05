package KiemTraCuoiModule2;

public class LopHoc {
    private String classId;
    private String className;
    private String teacherId;

    public LopHoc(String classId, String className, String teacherId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
    }

    public String toString() {
        return "Lớp học: " + classId + ", " + className + ", " + teacherId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
