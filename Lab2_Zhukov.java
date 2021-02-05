package com.company;

import java.util.Scanner;

public class Lab2_Zhukov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input alpha:");
        float alpha = in.nextInt();
        float z_1 = (float) (1 - 0.25 * (Math.pow(Math.sin(2 * alpha), 2)) + Math.cos(2 * alpha));
        System.out.println(z_1);


    }
}