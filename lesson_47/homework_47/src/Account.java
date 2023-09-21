public class Account {
    public String account;

    public Account(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                '}';
    }
}
