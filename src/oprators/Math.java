package oprators;
import java.util.Scanner;
public class Math {




    public static void main(String[] args) {
        int num1=54 ,  num2 =55;




        System.out.print("The value of num1 and num2 is");
        System.out.println(num1  +  num2);

        System.out.println("The value of num1 and num2 is");
        System.out.println(num1  -  num2);

        System.out.println("The value of num1 and num2 is");
        System.out.println(num1  *  num2);

        System.out.println("The value of num1 and num2 is");
        System.out.println(num1 / num2);

        System.out.println("The value of num1 % num2 is");
        System.out.println(num1 % num2);


        System.out.println(num2++);
        System.out.println(++num2);
        System.out.println(--num2);
        System.out.println(num2--);

//        RELATIONAL OPRTAOR
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1!=num2);

        System.out.println(num1==num2);


//        SHIFT OPRATOR
        num1 = 15;
        System.out.println(num2<<2);//15*2^2=60
        System.out.println(num2>>2);//15/2^2=3

        //T
}

}


