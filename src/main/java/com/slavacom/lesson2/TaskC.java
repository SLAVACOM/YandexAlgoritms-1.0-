package com.slavacom.lesson2;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        int minDiff = Integer.MAX_VALUE;
        int result = -1;


        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - number);
            if (diff < minDiff) {
                minDiff = diff;
                result = i;
            }
        }
        System.out.println(arr[result]);
    }
}
