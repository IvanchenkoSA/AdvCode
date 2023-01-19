package com.adventOfCode.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

class Day2 {
    public static void main(String[] args) {
        int myScorePart1 = 0;
        int myScorePart2 = 0;
        HashMap<String, Integer> hashMapForPart1 = new HashMap<>();
        hashMapForPart1.put("A X", 4);
        hashMapForPart1.put("A Y", 8);
        hashMapForPart1.put("A Z", 3);
        hashMapForPart1.put("B X", 1);
        hashMapForPart1.put("B Y", 5);
        hashMapForPart1.put("B Z", 9);
        hashMapForPart1.put("C X", 7);
        hashMapForPart1.put("C Y", 2);
        hashMapForPart1.put("C Z", 6);

        HashMap<String, Integer> hashMapForPart2 = new HashMap<>();
        hashMapForPart2.put("A Y", 4);
        hashMapForPart2.put("A X", 3);
        hashMapForPart2.put("A Z", 8);
        hashMapForPart2.put("B Y", 5);
        hashMapForPart2.put("B X", 1);
        hashMapForPart2.put("B Z", 9);
        hashMapForPart2.put("C Y", 6);
        hashMapForPart2.put("C X", 2);
        hashMapForPart2.put("C Z", 7);
        File file = new File("day2.txt");

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    myScorePart1 += hashMapForPart1.get(line);
                    myScorePart2 += hashMapForPart2.get(line);
                }
                System.out.println(myScorePart1);
                System.out.println(myScorePart2);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
