package org.example;

public class Main {
    public static void main(String[] args) {
        printFigure(6);
    }

    public static void printFigure(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                for (int j = 0; j < s; j++) {
                    System.out.print("*");
                }
            } else if (i == s - 2) {
                System.out.print("**");
            } else if (i == s - 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 0; j < s - i - 2; j++) {
                    System.out.print("$");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}