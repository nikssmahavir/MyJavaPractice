package arrays;

import java.security.PrivateKey;

public class Emp {
    private int empID;
    private String eName;
    static private String cName = "codekul";


    public Emp(int empID, String eName) {
        this.empID = empID;
        this.eName = eName;
    }


    void show() {
        System.out.println("empID:" + empID + "empName:" + eName + "cName:" + cName);
    }

    public static void main(String[] args) {
        Emp emp1 = new Emp(1, "emp1");
        Emp emp2 = new Emp(2, "emp2");
        Emp emp3 = new Emp(3, "emp3");
        Emp.cName = "fb";
         emp1.show();
         emp2.show();
         emp3.show();
    }

}


