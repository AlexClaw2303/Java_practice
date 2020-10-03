package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Student {
    public int[] array = new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public Student() throws IOException {
        for (int i = 0; i < 10; i++) {
            String num = reader.readLine();
            array[i] = Integer.parseInt(num);
        }
    }
    public void PrintElements() {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]);
        }
    }
    public void insertionSort() {
        for(int i = 1; i < array.length; i++){
            int currElem = array[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && array[prevKey] > currElem){
                array[prevKey+1] = array[prevKey];
                array[prevKey] = currElem;
                prevKey--;
            }
        }
    }
}
