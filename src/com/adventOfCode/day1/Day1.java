package com.adventOfCode.day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
        public static void main(String[] args) {
            int currentSum = 0;
            int firstPlace = 0;
            int secondPlace = 0;
            int thirdPlace = 0;
            File file = new File("day1.txt");

    try {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
            while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                if (currentSum > firstPlace){
                    int hold = firstPlace;
                    int hold2 = secondPlace;
                    firstPlace = currentSum;
                    secondPlace = hold;
                    thirdPlace = hold2;
                } else if (currentSum < firstPlace && currentSum > secondPlace){
                    int hold = secondPlace;
                    secondPlace = currentSum;
                    thirdPlace = hold;
                } else if (currentSum > thirdPlace && currentSum < secondPlace){
                    thirdPlace = currentSum;
                }
                currentSum = 0;
            } else {
                currentSum += Integer.parseInt(line);
            }
        }
            System.out.println("Сумма первого места " + firstPlace);
            System.out.printf("Сумма первых трёх мест " + (firstPlace + secondPlace + thirdPlace));
    }
    } catch (IOException e) {
        System.out.println("Bibu sosi");
        e.printStackTrace();
            }
        }
    }

