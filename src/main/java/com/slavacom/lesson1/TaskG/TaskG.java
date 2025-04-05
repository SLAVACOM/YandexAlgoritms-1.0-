package com.slavacom.lesson1.TaskG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);

        int result = 0;

        if (k < m) {
            System.out.println(0);
            return;
        }
        int details = k / m;
        int leftAfterDetails = k % m;

        while (n >= k) {
            int blanks = n / k;
            int leftAfterBlanks = n % k;


            result += blanks * details;
            n = leftAfterBlanks + blanks * leftAfterDetails;
        }

        System.out.println(result);
    }
}
