package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        LeftToRight ltr = new LeftToRight();
        System.out.print(ltr.SliceIT(n));
        return;
    }
}
