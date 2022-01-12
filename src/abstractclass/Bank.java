package abstractclass;

abstract class Bank {
    Bank (){
        System.out.println("Bank created");
    }
    abstract int getRateOfInterest ();
    void  getDetails(){
        System.out.println("Bank's Details");

    }
}
