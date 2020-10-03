package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    Student student = new Student();
	    System.out.println("Введённый массив:");
	    student.PrintElements();
	    student.insertionSort();
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
        student.PrintElements();
        return;
    }
}
