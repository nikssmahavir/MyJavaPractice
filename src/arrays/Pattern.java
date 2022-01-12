package arrays;

public class Pattern {
    public static void main(String[] args) {


        int i, j ;
        int n = 7 ;
        for (i=1; i<=n;  i++){
            for (j=1; j<=n-3; j++){
                if (i>=j && i<=8-j)
                    System.out.println("*");
                else {
                    System.out.println("@");
                }
//                System.out.println("/n");
            }
        }
    }

}
