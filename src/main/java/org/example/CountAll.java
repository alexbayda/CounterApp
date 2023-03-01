package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountAll {

    public static void countAll() {
        String filename = "C:/Users/Oleksandr_Bayda/Downloads/IA117_005_PartsWatch_Inventory_FlatFile_20230208_033257.txt/IA117_005_PartsWatch_Inventory_FlatFile_20230208_033257.txt";
        int count = 0;
        try (
                BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.substring(33, 41).trim().length() > 0) {
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + count);
    }
}
