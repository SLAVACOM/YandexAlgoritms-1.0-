package com.slavacom.TaskH;


import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int minN = n + (n - 1) * a;
        int minM = m + (m - 1) * b;

        int maxN = n + (n + 1) * a;
        int maxM = m + (m + 1) * b;

        if (maxM < minN || maxN < minM) {
            System.out.println(-1);
            return;
        }

        int min = Math.max(minN, minM);
        int max = Math.min(maxN, maxM);

        System.out.printf("%d %d", min, max);

    }
}
