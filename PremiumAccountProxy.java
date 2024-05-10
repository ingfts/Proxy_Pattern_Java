// PremiumAccountProxy.java
public class PremiumAccountProxy implements PremiumAccount {
    private String password;
    private Account realAccount;

    public PremiumAccountProxy(String password) {
        this.password = password;
    }

    @Override
    public void access() {
        if (authenticatedUser(password)) {
            if (realAccount == null){
                System.out.println("Connected to Premium services");
            }
            Account realAccount = new Account();
        } else {
            // Access denied: Do not create the real Account
            System.out.println("Access denied!");
        }
    }

    private boolean authenticatedUser(String password) {
        String correctPassword = "12345";
        return password.equals(correctPassword);
    }
}
