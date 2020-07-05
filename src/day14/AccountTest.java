package day14;

public class AccountTest {
    public static void main(String[] args) {

        Account c1 = new Account();
        Account c2 = new Account("123456",1000);

        Account.setInterestRate(0.012);
        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinBalance());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
