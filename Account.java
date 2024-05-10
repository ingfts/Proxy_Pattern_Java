public class Account implements PremiumAccount{
    @Override
    public void access(){
        System.out.println("Accessing premium services...");
    }
}
