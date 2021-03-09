package com.company;

public class CustomArrayList {
    private int index = 0;
    private int[] integers = new int[100];

    public void add(int element) {
        integers[index] = element;
        index++;
    }

    public int get(int index) {
        return this.integers[index];
    }

    public void isEmpty() {
        int index2 = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[index2] == 0) {
                index2++;
            }
            if (index2 == integers.length) {
                System.out.println("The list is empty.");
            }
        }
        if (index2 < integers.length) {
            System.out.println("The list is not empty.");
        }
    }

    public void size() {
        int index = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] != 0) {
                index++;
            }
        }
        System.out.println("There are " + index + " elements in the list.");
    }

    public void remove(int delete) {
        int found = 0;
        for (int i = 0; i < integers.length; i++) {
            int integer = integers[i];
            if (integer != 0) {
                if (integer == delete) {
                    found = i;
                }
            }
        }

        for (int i = found;i< integers.length-1;i++) {
            integers[i] = integers[i+1];
        }
        index--;


    }
}
