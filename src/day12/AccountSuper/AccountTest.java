package day12.AccountSuper;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);

        account.withdraw(30000);
        System.out.println(account.getBalance());

        account.withdraw(2500);
        System.out.println(account.getBalance());

        account.deposit(3000);
        System.out.println(account.getBalance()+"\t"+account.getAnnualInterestRate());
    }
}
