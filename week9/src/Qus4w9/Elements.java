package Qus4w9;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class Elements {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<Integer>();

        no.add(10);
        no.add(20);
        no.add(30);
        no.add(40);
        no.add(50);

        Iterator<Integer> iterator = no.iterator();
        System.out.println("Element in the list are: ");
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
