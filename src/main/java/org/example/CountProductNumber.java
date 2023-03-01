package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CountProductNumber {

    public static void countProductNumber() throws FileNotFoundException {

        HashMap<String, Integer> recordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:/Users/Oleksandr_Bayda/Downloads/IA117_005_PartsWatch_Inventory_FlatFile_20230208_033257.txt/IA117_005_PartsWatch_Inventory_FlatFile_20230208_033257.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String uniqueKey = line.substring(0, 4);
                if (!recordCountMap.containsKey(uniqueKey)) {
                    recordCountMap.put(uniqueKey, 0);
                }
                if (line.substring(34, 41).trim().length() > 0) {
                    int count = recordCountMap.get(uniqueKey);
                    recordCountMap.put(uniqueKey, count + 1);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Record counts by unique key:");
        for (String uniqueKey : recordCountMap.keySet()) {
            System.out.println(uniqueKey + ": " + recordCountMap.get(uniqueKey));
        }
    }
}

