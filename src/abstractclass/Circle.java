package abstractclass;


    public class Circle extends Shape {

        private  double radius;



        public Circle (double radius)
        {

            this.radius = radius;
        }



       @Override
        double calculateArea() {
            double m = (22 * radius * radius) / 7;
            return m;
        }


    }

