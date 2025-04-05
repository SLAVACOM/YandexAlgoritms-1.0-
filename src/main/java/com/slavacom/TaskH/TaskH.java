package com.slavacom.TaskH;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pattern = getValidPhoneNumber(sc.nextLine());

        for (int i = 0; i < 3; i++) {
            System.out.println(pattern.equals(getValidPhoneNumber(sc.nextLine())) ? "YES" : "NO");
        }
    }

    public static String getValidPhoneNumber(String phoneNumber) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            switch (ch) {
                case '+':
                    result.append("8");
                    i++;
                case '-':
                case '(':
                case ')':
                    break;
                default:
                    result.append(ch);
            }
        }
        switch (result.length()){
            case 7: result.insert(0, "8");
            case 8: result.insert(1, "495");
        }
        return result.toString();
    }


}
