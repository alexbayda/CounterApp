package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountIdentifiers {

    public static void countIdentifiers() {

        String filePath = "C:/Users/Oleksandr_Bayda/Downloads/IA117_005_PartsWatch_Inventory_FlatFile_20230208_033257.txt/IA117_005_PartsWatch_Inventory_FlatFile_20230208_033257.txt";

        Set<String> recordSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String record = line.substring(0, 4);
                recordSet.add(record);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Records in the set:");
        for (String record : recordSet) {
            System.out.println(record);
        }
    }
}

