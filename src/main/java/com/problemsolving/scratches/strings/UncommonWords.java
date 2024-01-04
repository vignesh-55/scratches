package com.problemsolving.scratches.strings;

import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        String s1 = "copper coffee pot";
        String s2 = "hot coffee pot";

        List<String> s1Array = Arrays.asList(s1.split(" "));
        List<String> s2Array = Arrays.asList(s2.split(" "));
        List<String> result = new ArrayList<>();
        result.addAll(s1Array);
        result.addAll(s2Array);

        result.forEach(e -> {
            if(result.indexOf(e) == result.lastIndexOf(e)){
                System.out.println(e);
            }
        });

        // can be solved using Hashmap - key count

    }


}
