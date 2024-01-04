package com.problemsolving.scratches.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamScratches {
    static List<User> users = List.of(
            new User(1L, "Amirhosein", "Gharaati", "amirgh1380@gmail.com", 22, List.of("computer", "board games")),
            new User(2L, "Mohammad", "Shoja", "rezajsh@yahoo.com", 26, List.of("computer", "guitar")),
            new User(3L, "Babak", "Ahmadi", "babakahmadi@gmail.com", 33, List.of("shopping")),
            new User(2L, "Robin", "Eklund", "robin.eklund@twitter.com", 28, List.of("reading")),
            new User(5L, "Amir", "Tavakoli", "amirtvkli@gmail.com", 30, List.of("reading", "computer", "cooking")),
            new User(5L, "Farhad", "Kiani", "farhadkiani@focalpay.se", 28, List.of())
    );




    public static void main(String[] args) {
        Optional<User> user = users.stream()
                .filter(StreamScratches::ageIsGreaterThanEqual25)
                .findFirst();
        String userName = user.isPresent() ? user.get().getFirstName() : "No one";

        long numberOfComputerInterest = users.stream()
                .map(User::getInterests).flatMap(Collection::stream).filter(e -> e.equals("computer")).count();
//                .flatMap(Collection::stream)
//                .filter(interest -> interest.equals("computer"))
//                .count();
        Map<Long, Long> userLongMap = users.stream().collect(Collectors.groupingBy(User::getId, Collectors.counting()));

        System.out.println(numberOfComputerInterest);
    }

    private static boolean ageIsGreaterThanEqual25(User user){
        return user.getAge() >= 125;
    }
}
