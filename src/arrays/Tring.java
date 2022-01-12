package arrays;

public class Tring {
    public static void main(String[] args) {
        int i, j, k;
        for (i=0; i<=5; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            for (k=1; k<=j; k--){
                System.out.print("");
            }

        }
        System.out.println();
    }

}
