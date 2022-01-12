package abstractclass;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new SBI();
        System.out.println("Interest is"+ bank.getRateOfInterest()+"%");
        bank.getDetails ();

        bank = new HDFC ();
        System.out.println("Interest is"+ bank.getRateOfInterest()+"%");
        bank.getDetails ();
    }
}
