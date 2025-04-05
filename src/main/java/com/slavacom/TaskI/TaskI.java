package com.slavacom.TaskI;

import java.util.Arrays;
import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] brickSizes = new int[]{
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
        };

        int d = scanner.nextInt();
        int e = scanner.nextInt();

        System.out.println(taskI(brickSizes, d, e) ? "YES" : "NO");

    }

    public static boolean taskI(int[] brickSizes, int d, int e) {
        Arrays.sort(brickSizes);
        if (d > e) return brickSizes[0] <= e && brickSizes[1] <= d;
        return brickSizes[0] <= d && brickSizes[1] <= e;
    }
}
