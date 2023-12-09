package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(nr -> {
            System.out.println(nr);
        });
        System.out.println("==========================");

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(nr -> {
            return nr < 5;
        }).forEach(nr -> {
            System.out.println(nr);
        });
        System.out.println("==========================");

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(nr -> {
            return nr < 5;
        }).skip(1).limit(2).forEach(nr -> {
            System.out.println(nr);
        });
        System.out.println("==========================");


        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        StreamSources.intNumbersStream().filter(nr -> {
            return nr > 5;
        }).limit(1).forEach(nr -> {
            System.out.println(nr);
        });
        System.out.println("==========================");

        // Print first names of all users in userStream
        StreamSources.userStream().map(user -> user.getFirstName()).forEach(user -> {
            System.out.println(user);
        });
        System.out.println("==========================");

        // Print first names in userStream for users that have IDs from number stream
        StreamSources.intNumbersStream().forEach(nr -> {
            StreamSources.userStream().filter(user -> {
                return user.getId() == nr;
            }).forEach(user -> {
                System.out.println(user.getFirstName());
            });
        });
    }

}


https://www.youtube.com/watch?v=EExlnnq5Grs&list=PLqq-6Pq4lTTYPR2oH7kgElMYZhJd4vOGI
Verder gaan bij 2e helft video 7