public class Methodoverload {
      public static void main(String[] args) {
            Methodoverload obj = new Methodoverload();
            int k = obj.add(4,8);
            System.out.println(k);
            System.out.println(obj.add(3.2f,7));
            System.out.println(obj.add(1,5,6));


      }


      public int add(int i, int j) {
            return i + j;
      }

      public float add(float i, int j) {
            return i + j;
      }

      public int add (int i ,int j,int k) {
            return i + j + k;
      }


}

