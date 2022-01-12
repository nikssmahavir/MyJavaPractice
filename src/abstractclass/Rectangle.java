package abstractclass;



    public class Rectangle extends Shape {

        private  int length;
        private int breadth;

        public Rectangle(int breadth, int length)
        {


            this.breadth = breadth;
            this.length = length;
        }



    @Override
        double calculateArea() {
            double t = length * breadth;
            return t;
        }


    }

