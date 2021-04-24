package SwapnaCoding;

import java.util.ArrayList;
import java.util.List;

public class Constructors {
     Constructors(String s){
         System.out.println("The string is " +s);


    }

    public static void main(String[] args) {
         ArrayList<String> s1 = new ArrayList<String>();
         s1.add("Super");
         s1.add("Excellent");
         s1.add("Good");

         s1.forEach(Constructors::new);//Calling the constructor class



    }
}
