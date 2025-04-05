package com.slavacom.TaskB;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(rectangleIsValid(a, b, c) ? "YES" : "NO");
    }

    public static boolean rectangleIsValid(int a, int b, int c) {
        return (a < b + c && b < a + c && c < a + b);
    }
}
