package abstractclass;

public class HDFC extends Bank {

    @Override
    int getRateOfInterest (){
        return 8;
    }
    @Override
    void getDetails (){
        System.out.println("HDFC bank details ");
    }
}
