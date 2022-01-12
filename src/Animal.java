
public class Animal {
    public void sound (){
        System.out.println(("Animal sound"));
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("dog sound");
    }


    public static void main (String []args){
        Dog obj = new Dog ();
        obj.sound();
    }
}
  