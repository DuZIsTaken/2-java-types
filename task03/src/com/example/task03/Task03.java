package com.example.task03;

import java.util.Scanner;

public class Main {
    public static int getMetreFromCentimetre(int centimetre) {
        Scanner input = new Scanner(System.in);
        int getMetre = input.nextInt();
        int result = getMetre / 100;
        return result;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(345);
        System.out.println(result);
    }

}
