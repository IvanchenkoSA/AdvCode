package com.adventOfCode.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

class Day3 {
   public static void main(String[] args) {
      int score = 0;
      File file = new File("day3.txt");
      HashSet<Character> chPart1 = new HashSet<>();
      HashSet<Character> chPart2 = new HashSet<>();
      try {
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               String subStrPart1 = line.substring(0, line.length()/2);
               String subStrPart2 = line.substring(line.length()/2, line.length());

               for (int i = 0;i < subStrPart1.length();i++){
                  chPart1.add(subStrPart1.charAt(i));
               }
               for (int j = 0;j < subStrPart2.length();j++){
                  chPart2.add(subStrPart2.charAt(j));
               }

               String subChPart1 = String.valueOf(chPart1);
               String subChPart2 = String.valueOf(chPart2);

               for (int i = 0; i < subChPart1.length(); i++) {
                  char a = subChPart1.charAt(i);
                  for (int j = 0; j < subChPart2.length(); j++) {
                     if (a == subChPart2.charAt(j))
                     {
                        if (a >= 97 && a <= 122){
                           int x = a - 96;
                           score += x;
                           break;
                        } else if (a >= 65 && a <= 90){
                           int z = a - 38;
                           score += z;
                           break;
                        }
                     }
                  }
                  chPart1.clear();
                  chPart2.clear();
               }
            }
         }
      }catch (IOException e) {
         e.printStackTrace();
      }
      System.out.println(score);
   }

}
