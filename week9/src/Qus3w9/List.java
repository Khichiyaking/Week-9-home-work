package Qus3w9;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Orange");
        System.out.println("Colors List Are: ");
        for (String colors1 : colors){
            System.out.println(colors1);
        }
    }
}
