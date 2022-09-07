package ru.marshenina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraysListExamples {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Первый");
        stringList.add("Второй");
        stringList.add("Третий");
        stringList.add("Десятый");
        System.out.println(stringList);
        stringList.remove(3);
        System.out.println(stringList);
        System.out.println(stringList.size());

        if (stringList.contains("Третий")){
            stringList.clear();
        }
        System.out.println(stringList);

        List<Integer> intList = new ArrayList<>(5);
       
        intList.add(1);
        intList.add(3);
        intList.add(1,2);
        intList.add(4);

        System.out.println(intList);

        intList.remove(Integer.valueOf(1));

        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
}
