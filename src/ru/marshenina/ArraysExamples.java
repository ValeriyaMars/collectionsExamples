package ru.marshenina;

import java.util.Arrays;
import java.util.Collection;

public class ArraysExamples {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i : array) {
            System.out.println(array[i]);
        }

        int[] array2 = new int[]{1, 5, 8, 7, 2};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
