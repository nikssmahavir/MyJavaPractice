package abstractclass;


public class Triangle extends Shape {

    private int base;
    private int height;


    public Triangle(int base, int height)
    {


        this.base = base;
        this.height = height;
    }



@Override
    double calculateArea() {
        double v = 0.5 * base * height;
        return v;
    }

}