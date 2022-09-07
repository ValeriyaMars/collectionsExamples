package ru.marshenina;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> devices = new HashMap<>();

        devices.put(10, "Huawei");
        devices.put(20, "Xiaomi");
        devices.put(30, "Apple");

        System.out.println(devices.entrySet());
        System.out.println(devices.get(30));
        System.out.println(devices.values());

        devices.replace(10, "Huawei", "Android");
        devices.replace(30, "Apple", "iOS");
        devices.remove(20);

        System.out.println(devices.entrySet());
        System.out.println();

        Map<Integer, String> purchases = new LinkedHashMap<>();

        purchases.put(125, "Молоко");
        purchases.put(315, "Арбуз");
        purchases.put(22, "Хлеб");

        for (Map.Entry<Integer, String> entry : purchases.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();

        Map<Integer, String> people = new TreeMap<>();

        people.put(5, "Иван");
        people.put(80, "Василий");
        people.put(35, "Николай");

        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
