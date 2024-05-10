public class User {
    public static void main(String[] args) {
        PremiumAccount premiumAccount = new Account();
        premiumAccount.access();

       PremiumAccountProxy premiumProxy = new PremiumAccountProxy("12345");
       premiumProxy.access();

    }
}
