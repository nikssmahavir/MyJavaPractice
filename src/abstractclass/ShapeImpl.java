package abstractclass;

import java.util.Scanner;

public class ShapeImpl {
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("shape");
            System.out.println("1  Area of triangle");
            System.out.println("2  Area of Rectangle");
            System.out.println("3  Area of Circle");
            System.out.println("4  Area of Square");
            System.out.println("Enter above shape");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Please enter base and height of triangle: ");
                    int base = scanner.nextInt();
                    int height = scanner.nextInt();
                    Shape triangle = new Triangle(base, height);
                    System.out.println("area of triangle:" + triangle.calculateArea());
                    break;
                    case 2:
                    System.out.println("Please enter base and height of triangle: ");
                     int length = scanner.nextInt();
                     int breadth = scanner.nextInt();
                    Shape Rectangle = new Rectangle (length, breadth);
                    System.out.println("area of rectangle:" + Rectangle.calculateArea());
                    break;
                case 3:
                    System.out.println("Please enter radius of circle: ");
                    int radius = scanner.nextInt();
                    int circle = scanner.nextInt();
                    Shape Circle = new Circle (22*radius*radius);
                    System.out.println("radius of circle:" + Circle.calculateArea());
                    break;
                case 4:
                    System.out.println("Please enter base and height of Squre: ");
                    int side = scanner.nextInt();
                    Shape Squre = new Square (side*side);
                    System.out.println("area of rectangle:" + Squre.calculateArea());
                    break;


            }


        } while (ch < 6);
    }
}

