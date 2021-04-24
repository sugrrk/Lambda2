package SwapnaCoding;

import java.util.ArrayList;
//Using instance method.
public class Instance {
    void m2 (String d){
        System.out.println(d);
    }

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Super");
        s1.add("Excellent");
        s1.add("Good");
//
        s1.forEach((new Instance()) ::m2);
        //s1.stream().map(i->i+1);
    }
}
