package day12.AccountSuper;

public class CheckAccountTest {

    public static void main(String[] args) {

        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withdraw(5000);
        System.out.println(checkAccount.getBalance()+"\t"+checkAccount.getOverdraft()); //15000  5000

        checkAccount.withdraw(18000);
        System.out.println(checkAccount.getBalance()+"\t"+checkAccount.getOverdraft()); // 0  2000

        checkAccount.withdraw(3000);   // 不可超过透支
        System.out.println(checkAccount.getBalance()+"\t"+checkAccount.getOverdraft());  // 0.0	2000.0

    }
}
