package com.techtorial.academy;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         *
         * Interview question #9: How can you remove all duplicates from ArrayList?
         *
         */
        List<Integer> arrayList = new ArrayList<>();

        // Fill out the arrayList with duplicated values
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            } else {
                arrayList.add(3);
            }
        }

        System.out.println("Initial array list: " + arrayList);

        // Create a set instance to check for duplications
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            // returns true if the value did not exist in this set
            boolean isUnique = set.add(arrayList.get(i));
            // if the value existed, then we remove it from the initial arrayList
            if (!isUnique) {
                arrayList.remove(i);
            }
        }

        System.out.println("Array list with no duplications: " + arrayList);
    }
}
