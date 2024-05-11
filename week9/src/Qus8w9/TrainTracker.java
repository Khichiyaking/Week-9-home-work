package Qus8w9;

import java.util.HashMap;
import java.util.HashSet;

public class TrainTracker {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> lines = new HashMap<>();

        //
        HashSet<String> line1Stations = new HashSet<>();
        line1Stations.add("Station A");
        line1Stations.add("Station B");
        line1Stations.add("Station C");

        HashSet<String> line2Stations = new HashSet<>();
        line2Stations.add("Station C");
        line2Stations.add("Station D");
        line2Stations.add("Station E");

        HashSet<String> line3Stations = new HashSet<>();
        line3Stations.add("Station E");
        line3Stations.add("Station F");
        line3Stations.add("Station G");

        // Add lines and their stations to the HashMap
        lines.put("Line 1", line1Stations);
        lines.put("Line 2", line2Stations);
        lines.put("Line 3", line3Stations);

        // Define Zone 1 stations
        HashSet<String> zone1Stations = new HashSet<>();
        zone1Stations.add("Station A");
        zone1Stations.add("Station B");
        zone1Stations.add("Station C");
        zone1Stations.add("Station D");
        zone1Stations.add("Station E");
        zone1Stations.add("Station F");
        zone1Stations.add("Station G");

        // Print lines passing through Zone 1 stations
        System.out.println("Lines passing through Zone 1 stations:");
        for (String line : lines.keySet()) {
            HashSet<String> stations = lines.get(line);
            boolean passesThroughZone1 = false;
            for (String station : stations) {
                if (zone1Stations.contains(station)) {
                    passesThroughZone1 = true;
                    break;
                }
            }
            if (passesThroughZone1) {
                System.out.println(line);
            }
        }
    }
}
