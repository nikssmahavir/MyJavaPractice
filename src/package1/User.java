package package1;


public class User {
    private  String name = "abc";

    public void displayPublic(){
        System.out.println("Hello Public" +name);
    }
    private void displayPrivate()
    {
        System.out.println("Hello Private" +name);
    }
    protected void displayProtected(){
        System.out.println("Hello protected" +name);
    }

    void displayDefault(){
        System.out.println("Hello Default" +name);
    }

}
