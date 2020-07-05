package day10.BoyGirl;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("rumio",20);
        Girl girl1 = new Girl("julia", 18);

        boy1.marray(girl1);
        boy1.shout();

        Boy boy2 = new Boy("lucas", 15);
        boy2.shout();

        boy2.setAge(21);
        boy2.shout();

        // compare
        Girl girl2 = new Girl("andy", 23);
        girl1.compare(girl2);


    }
}
