package SwapnaCoding;

import java.util.ArrayList;

public class Static {
    static void m1(String s) {
        System.out.println(s + " are strings");
    }

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Super");
        s1.add("Excellent");
        s1.add("Good");

        s1.forEach( Static:: m1);
    }
}
