package Qus7w9;

import java.util.HashMap;
import java.util.Map;

public class AppleMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Dhaval",31);
        people.put("Darshan",34);
        people.put("Rushi",29);
        people.put("Shubham",27);
        people.put("Maulik",30);
        System.out.println("Values in the map: ");
       // for (String name : people.keySet()){
         //   System.out.println(name);
      for (Integer value : people.values()){
          System.out.println(value);
        }
    }
}
