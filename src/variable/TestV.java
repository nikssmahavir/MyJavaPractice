package variable;

public class TestV {
    int a = 5;
    static int b = 10;

    public static void main(String[] args) {
     int local = 15;
     TestV testV = new TestV();
        System.out.println("value of a is "+testV.a);
        System.out.println("value of local is "+local);
        System.out.println("value of a b "+testV.b);
    }
}
