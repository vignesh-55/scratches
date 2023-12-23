package com.problemsolving.scratches.strings;

import java.util.Arrays;

public class SpotTheDifference {
    public static void main(String[] args) {
        String s = "fobr";
        String t = "brtof";
//        System.out.printf(spotTheDifference(s,t));
        char ch = 0;
        for(char c : s.toCharArray()){ // bit manipulation
            ch ^= c;
            System.out.println(ch);
        }
        for(char c : t.toCharArray()){
            ch ^= c;
            System.out.println(ch);
        }

//        int temp[] = new int[26];
//        int low = 0;
//        for(int i=0; i<t.length(); i++){
//            temp[t.charAt(i)-'a']++;
//            if(low!=s.length()){
//                temp[s.charAt(low)-'a']++;
//                low++;
//            }
//        }
//        for(int i=0; i<26; i++){
//            if(temp[i]%2!=0) return (char)(i + 'a');
//        }
//        return 'N';
    }

    private static String spotTheDifference(String s, String t) {
        String result = "";
        if(s.length() + 1 != t.length()) {
            return "";
        }
        String newS = sortTheString(s);
        String newT = sortTheString(t);
        int i = 0, j = 0;
        for( ; i < newT.length() && j < newS.length(); i++, j++){
            if(newT.charAt(i) != newS.charAt(j)){
                result = String.valueOf(newT.charAt(i));
                i++;
            }
        }
        if(result.isEmpty() && i == newT.length()-1){
            result = String.valueOf(newT.charAt(i));
        }

        return result;
    }

    public static String sortTheString(String input){
        char[] array = input.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
