package incapsulation;

public class Student {
    private int rollNo = 1;
    private static String StudName = "codekul";
    private String password;

    public static String getStudName() {
        return StudName;
    }

    public void setStudName(String studName) {
        StudName = studName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
