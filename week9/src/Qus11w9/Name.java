package Qus11w9;

import java.util.ArrayList;
import java.util.List;

public class Name {
    private static final String myname = "Dhaval";

    public static void main(String[] args) {
        List<String> groupmembers = new ArrayList<>();

        groupmembers.add("Darshan");
        groupmembers.add("Abhi");
        groupmembers.add("Subham");
        groupmembers.add("Maulik");
        groupmembers.add(myname);
        for (String member : groupmembers) {
            if (member.equals(myname)){
                System.out.println(member);
            }
        }
    }
}
