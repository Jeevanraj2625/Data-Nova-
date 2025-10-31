// src/main/java/com/example/dataanalysis/DataLoader.java

package com.example.dataanalysis;

import com.example.dataanalysis.model.DataPoint;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public List<DataPoint> loadData(String filePath) {
        List<DataPoint> dataPoints = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                dataPoints.add(new DataPoint(Double.parseDouble(values[0]), Double.parseDouble(values[1])));
            }
        } catch (IOException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
        return dataPoints;
    }
}
