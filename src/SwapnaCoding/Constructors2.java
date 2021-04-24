package SwapnaCoding;

import java.util.*;

public class Constructors2 {
    Constructors2(Integer i){
        System.out.println("The integer is " + i*i);
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(2);
        l.add(4);
        l.add(3);
        l.forEach(Constructors2::new);
        }

    }