package com.slavacom.lesson2;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");

        for (int i = 0; i < str.length - 1; i++) {
            if (str[i + 1].compareTo(str[i]) <= 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
