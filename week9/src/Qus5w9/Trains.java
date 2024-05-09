package Qus5w9;

import java.util.ArrayList;

public class Trains {
    public static void main(String[] args) {
        ArrayList<String> undergroundtube = new ArrayList<String>();

        undergroundtube.add("Central Line");
        undergroundtube.add("Jubilee Line");
        undergroundtube.add("Northern Line");
        undergroundtube.add("District Line");
        undergroundtube.add("Piccadilly Line");

        if (undergroundtube.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The List is not empty");
            System.out.println("The tube lines in the list are: ");
            for (String line : undergroundtube){
                System.out.println(line);
            }
        }
        undergroundtube.clear();
        if (undergroundtube.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }
    }
}
