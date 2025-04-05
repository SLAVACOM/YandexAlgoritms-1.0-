package com.slavacom.TaskE;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k1 = sc.nextInt(), m = sc.nextInt(), k2 = sc.nextInt(), p2 = sc.nextInt(), n2 = sc.nextInt();

        Set<Integer> pSet = new HashSet<>();
        Set<Integer> nSet = new HashSet<>();

        boolean isValid = false;

        for (int x = 1; x <= 1000_000; x++) {
            int minK2 = ((p2 - 1) * m + (n2 - 1)) * x + 1;
            if (k2 < minK2) break;

            int maxK2 = minK2 + x - 1;
            if (k2 > maxK2) continue;

            isValid = true;

            int k1Index = k1 - 1;
            int entrance = k1Index / (x * m) + 1;
            int floor = (k1Index % (x * m)) / x + 1;

            pSet.add(entrance);
            nSet.add(floor);
        }

        if (!isValid) System.out.println("-1 -1");
        else {
            int p1 = (pSet.size() == 1) ? pSet.iterator().next() : 0;
            int n1 = (nSet.size() == 1) ? nSet.iterator().next() : 0;
            System.out.println(p1 + " " + n1);
        }
    }
}
