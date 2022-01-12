package variables;

import javax.swing.text.AsyncBoxView;

public  class Instances {
    int a =20;
}
class child extends Instances{
    int a = 15 ;
    void  show (int a)
    {
        System.out.println("local:"+a);
        System.out.println("this:"+this.a);
        System.out.println("super:"+ super.a);
    }

    public static void main(String[] args)
    {
        child child = new child();
        child.show(5);
    }
}