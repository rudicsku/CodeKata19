package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadFromFile {

    public static List<String> readFromFileToList(String path){
        if(path == null || path.isBlank()){
            System.out.println("File not found!");
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException exception) {
            System.out.println("File not found!");
        }
        return result;
    }

    public static Set<String> readFromFileToSet(String path){
        if(path == null || path.isBlank()){
            System.out.println("File not found!");
            return new HashSet<>();
        }
        Set<String> result = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException exception) {
            System.out.println("File not found!");
        }
        return result;
    }
}
