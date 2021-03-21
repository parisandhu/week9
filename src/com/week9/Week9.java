package com.week9;

import java.util.*;

public class Week9 {

    public static void main(String args[]){
        String input = "hello hello how Are you HELLO are there happy test you";

        String []words = input.trim().split(" ");

        Map<String, Integer> uniqueWords = new HashMap<>();

        for(String word: words){
            if(uniqueWords.containsKey(word.toLowerCase())){
                uniqueWords.put(word.toLowerCase(), uniqueWords.get(word.toLowerCase())+1);
            }else {
                uniqueWords.put(word, 1);
            }
        }

        System.out.println("Input: "+input);
        System.out.println("Output: ");
        for (Map.Entry<String, Integer> stringIntegerEntry : uniqueWords.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" -> "+stringIntegerEntry.getValue());
        }

    }
}
