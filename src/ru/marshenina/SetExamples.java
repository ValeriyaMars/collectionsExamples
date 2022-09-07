package ru.marshenina;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> stringSet = new HashSet<>();
        Set<Integer> linkedStringSet = new LinkedHashSet<>();
        Set<Integer> treeStringSet = new TreeSet<>();


        stringSet.add(100);
        stringSet.add(200);
        stringSet.add(300);
        stringSet.add(400);
        stringSet.add(500);
        stringSet.add(100);

        System.out.println("HashSet: " + stringSet);

        linkedStringSet.add(9);
        linkedStringSet.add(8);
        linkedStringSet.add(5);
        linkedStringSet.add(3);
        linkedStringSet.add(7);

        System.out.println("LinkedHashSet: " + linkedStringSet);

        treeStringSet.add(5);
        treeStringSet.add(9);
        treeStringSet.add(3);
        treeStringSet.add(25);
        treeStringSet.add(1);

        for (Integer value : treeStringSet)
            System.out.println(value);

    }
}
