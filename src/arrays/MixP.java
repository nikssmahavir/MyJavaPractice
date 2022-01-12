package arrays;

public class MixP {
    public static void main(String[] args) {
        int i, j;
//        first straight pattern
        for (i = 1; i <= 5; i++)
          {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
          }
//        second  star reverse pattern
        for (i = 1; i <= 5; i++)
            {
            for (j = 4; j >= i; j--)
            {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}