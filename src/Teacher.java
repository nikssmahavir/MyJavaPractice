public class Teacher {

        int id;
        String name;
        String address;


        public static void main(String[] args) {
            Teacher obj = new Teacher();
            obj.id = 1;
            obj.name = "mahavir";
            obj.address = "pune gujarat colany";


            System.out.println("id=" + obj.id + "id=" + obj.name + "id=" + obj.address);

        }

}

class chemistryTeacher extends Teacher {
    public static void main(String[] args) {
        chemistryTeacher obj = new chemistryTeacher();
        obj.id = 1;
        obj.name = "mahaveer";
        obj.address = "pune gujarat colany";

        System.out.println("id=" + obj.id + "id=" + obj.name + "id=" + obj.address);
    }
}
    class Mathteacher extends chemistryTeacher {
    public static void main (String [] args){
        Mathteacher obj = new Mathteacher();
        obj.id = 1;
        obj.name = "mahaveer";
        obj.address = "pune gujarat colany";

        System.out.println("id=" + obj.id + "id=" + obj.name + "id=" + obj.address);

    }

    }



