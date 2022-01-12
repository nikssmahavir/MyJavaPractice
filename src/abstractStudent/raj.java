package abstractStudent;

public class raj extends Student{
    @Override
    public void marks() {
        System.out.println("85 , 85 , 95");
    }

    @Override
    public void grades() {
        System.out.println("A");
    }

    @Override
    public void subject() {
        System.out.println("math ,science ,bio ");
    }

    @Override
    public void result() {
        System.out.println("result");
    }



    public static void main (String [] args){
        raj o = new raj ();
        o.marks();
        o.grades();
        o.subject();
        o.result();
    }
}
