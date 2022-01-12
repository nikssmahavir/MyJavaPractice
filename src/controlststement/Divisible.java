package controlststement;

public class Divisible {
    public static void main(String[] args) {
        int no= 3;
        if ( no%3==0  && no%5==0)
            System.out.println("divisible by 5 and 3");
         else if (no%3==0)
            System.out.println("divisible by 3");
        else if (no%5==0)
            System.out.println("divisible by 5");
        else if (no%7==0)
            System.out.println("divisible by 7");
        else {
            System.out.println("input is wrong");
        }
    }
}
