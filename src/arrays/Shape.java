package arrays;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
// firstly I am print salect shape option
        System.out.println("shape");
        System.out.println("1  Area of triangle");
        System.out.println("2  Area of Rectangle");
        System.out.println("3  Area of Circle");
        System.out.println("4  Area of Square");
        System.out.println("Enter above shape");
        int num = sc.nextInt();
//        then after I will run switch condition
//      switch statement will be start by veera
        switch (num)
        {
               case 1: System.out.println("Please enter base and height of triangle: ");
                double base = sc.nextFloat();
                double height = sc.nextFloat();
                double areaTriangle = (base* height) / 2;
                System.out.println("Area of triangle is: " + areaTriangle);
                break;
                case 2:
                System.out.println("please enter length and breadth of rectangle");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                int arearectangle = length*breadth;
                System.out.println("area of Rectangle is:" +arearectangle);
               case 3:
                   System.out.println("please enter radius of circle");
                   double radius = sc.nextFloat();
                   double areaCircle = (22* radius * radius)/7;
                   System.out.println("area of circle:"+areaCircle);
               case 4 :
                   System.out.println("please enter area of square");
                   int side = sc.nextInt();
                   int areaofsquare = (side*side);
                   System.out.println("please enter area of square :"+areaofsquare);

        }
//        this is the return statement for scanner
        sc.close();

    }

}
