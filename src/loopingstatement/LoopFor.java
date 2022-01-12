package loopingstatement;
import java.util.Scanner;
public class LoopFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );
        System.out.println("enter no");
        int no = sc.nextInt();
        System.out.println("no is " +no);

        for (int i = 0;  i<=10; i++){
            System.out.println(no*i);
        }

    }

}
