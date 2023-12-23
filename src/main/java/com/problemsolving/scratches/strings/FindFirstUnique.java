package com.problemsolving.scratches.strings;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUnique {
    public static void main(String[] args) {
        String s = "aachbbhc";
        Map<Character, Integer> keyMap= new HashMap<>();

        for(int i = 0; i < s.toCharArray().length; i++){
            if(s.indexOf(s.toCharArray()[i]) == s.lastIndexOf(s.toCharArray()[i])){
                System.out.println(i);
                break;
            }
        }

        // order is not maintaining in map
//        for(char st : s.toCharArray()){
//            if(keyMap.get(st) == null){
//                keyMap.putIfAbsent(st, 1);
//            }else{
//                keyMap.put(st, keyMap.getOrDefault(st,1)+1);
//            }
//        }
//        for(Map.Entry<Character, Integer> kv : keyMap.entrySet()){
//            if(kv.getValue() == 1){
//                System.out.println(s.indexOf(String.valueOf(kv.getKey())));
//                break;
//            }
//        }
        // will return the first character always i.e a
//        int[] charArray = new int[26];
//        for(int i = 0; i < s.toCharArray().length; i++){
//            charArray[s.charAt(i) - 'a']++;
//        }
//        for(int i = 0; i < charArray.length; i++){
//            if(charArray[i] == 1){
//                System.out.println((char) (i + 'a') + " => " + i);
//                break;
//            }
//        }
    }
}
