package com.slavacom.TaskA;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tRoom = scanner.nextInt();
        int tCond = scanner.nextInt();
        scanner.nextLine();

        String mode = scanner.nextLine();
        System.out.println(taskA(tRoom, tCond, mode));
    }

    public static int taskA(int tRoom, int tCond, String mode) {
       return switch (mode){
           case "freeze" -> Math.min(tRoom, tCond);
           case "heat" ->  Math.max(tRoom, tCond);
           case "fan" -> tRoom;
           case "auto" ->  tCond;
           default -> -1;
       };
    }
}
