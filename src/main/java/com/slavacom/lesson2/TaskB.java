package com.slavacom.lesson2;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isConstants = true;
        boolean isAscending = true;
        boolean isWeaklyAscending = true;
        boolean isDescending = true;
        boolean isWeaklyDescending = true;

        int prev = sc.nextInt();
        while (true) {
            int curr = sc.nextInt();
            if (curr == -2000000000) break;

            if (curr != prev) isConstants = false;

            if (curr <= prev) isAscending = false;
            if (curr < prev) isWeaklyAscending = false;

            if (curr >= prev) isDescending = false;
            if (curr > prev) isWeaklyDescending = false;
            prev = curr;
        }
        if (isConstants) System.out.println("CONSTANT");
        else if (isAscending) System.out.println("ASCENDING");
        else if (isWeaklyAscending) System.out.println("WEAKLY ASCENDING");
        else if (isDescending) System.out.println("DESCENDING");
        else if (isWeaklyDescending) System.out.println("WEAKLY DESCENDING");
        else System.out.println("RANDOM");
    }
}
