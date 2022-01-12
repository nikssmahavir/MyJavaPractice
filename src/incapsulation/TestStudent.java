package incapsulation;

public class TestStudent {
  public static void main (String[]args){
      Student student = new Student();

      student.setRollNo(5);
      student.setPassword("veer#56897");



      System.out.println("Name"+Student.getStudName());
  }

}
