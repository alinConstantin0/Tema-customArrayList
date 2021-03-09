package com.company;

public class Main {

    public static void main(String[] args) {
        CustomArrayList integersList = new CustomArrayList();
        integersList.add(2);
        integersList.isEmpty();
        integersList.remove(2);
        integersList.isEmpty();
        integersList.add(3);
        integersList.add(23);
        integersList.add(87);
        int element = integersList.get(2);
        System.out.println(element);
        integersList.add(8);
        integersList.size();
    }
}
