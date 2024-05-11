package Qus6w9;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(4);
        s.add(7);
        s.add(8);

        System.out.println("Number between 1 & 10 Present set: ");
        for (int a =1; a<= 10; a++){
            if (s.contains(a)){
                System.out.println(a);
            }
        }
    }
}
