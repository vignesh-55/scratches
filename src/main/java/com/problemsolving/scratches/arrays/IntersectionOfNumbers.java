package com.problemsolving.scratches.arrays;

import java.util.*;
import java.util.stream.Stream;

public class IntersectionOfNumbers {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{2, 4, 6, 8};
        Integer[] array2 = new Integer[]{1, 3, 5, 7};
        Set<Integer> result = new HashSet<>();
        List<Integer> arrayList = Arrays.asList(array1);
        List<Integer> arrayList1 = Arrays.asList(array2);

        Integer[] resultArray = Stream.of(array1)
                .filter(Arrays.asList(array2)::contains)
                .distinct()
                .toArray(Integer[]::new);

        /*HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(array1));
        set.retainAll(Arrays.asList(array2));
        Integer[] intersection = set.toArray(new Integer[0]);*/

        arrayList.forEach(e -> {
            if(arrayList1.stream().anyMatch(f -> f.equals(e))){
                result.add(e);
            }
        });
        result.forEach(System.out::println);

    }
}
