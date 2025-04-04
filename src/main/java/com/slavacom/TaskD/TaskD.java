package com.slavacom.TaskD;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        solveEquation(a, b, c);
    }

    public static void solveEquation(int a, int b, int c) {
        if (c < 0) {
            System.out.println("NO SOLUTION");
            return;
        }

        int right = c * c;

        if (a == 0) {
            System.out.println((b == right) ? "MANY" : "NO" + " SOLUTIONS");
        } else {
            int numerator = right - b;
            if (numerator % a != 0) {
                System.out.println("NO SOLUTION");
                return;
            }

            int x = numerator / a;
            if (a * x + b < 0) System.out.println("NO SOLUTION");
            else System.out.println(x);
        }
    }
}
