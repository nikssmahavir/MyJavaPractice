package abstractclass;


    public class Square extends Shape {

        private int side;



        public Square (int side)
        {

            this.side = side;

        }



       @Override
        double calculateArea()
       {
            double w = (side*side);
            return w;
        }
    }

