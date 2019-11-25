package com.school.mindera;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2, 2, 2, 0, 3, 3, 1, 1, 1, 1, 1, 4};
        System.out.println(longestsequence(numbers));
    }

    public static int longestsequence(int[] arr) {
        int count = 0;
        int temp = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            temp = arr[i];
            if (arr[i + 1] != temp) {
                temp = arr[i + 1];
            } else {
                count += 1;
                temp = arr[i + 1];
            }
        }
        return count;

    }
}
