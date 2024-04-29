package JavaCollections.SigortaYönetimSistemi;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts = new TreeSet<>();

    public Account login(String email, String password) {
        for (Account account : accounts) {
            try {
                account.login(email, password);
                return account;
            } catch (InvalidAuthenticationException e) {
            }
        }
        return null;
    }
}
