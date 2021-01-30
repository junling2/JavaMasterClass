package com.junling2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, String> locations = new HashMap<>();
    public static Map<Integer, String> readLocations = new HashMap<>();

    public static void main(String[] args) throws IOException {
        // write your code here
        locations.put(1, "forest");
        locations.put(2, "lake");
        locations.put(3, "mountain");
        locations.put(4, "lodge");
        locations.put(5, "hotel");

        BufferedWriter locationFile = new BufferedWriter(new FileWriter("locations.txt"));

        for (Map.Entry<Integer, String> entry : locations.entrySet()) {
            locationFile.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        locationFile.close();

        BufferedReader reader = new BufferedReader(new FileReader("locations.txt"));
        String input;
        while ((input = reader.readLine()) != null) {
            System.out.println(input);
            String[] strArray = input.split(":");
            int index = Integer.parseInt(strArray[0]);
            String description = strArray[1].strip();
            readLocations.put(index, description);
        }
        reader.close();
        System.out.println(readLocations);
    }
}
