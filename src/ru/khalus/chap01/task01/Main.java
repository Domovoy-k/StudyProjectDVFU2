package ru.khalus.chap01.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите натуральное число: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        int x = a%10;

        System.out.println("Младший разряд числа это: " + x);
    }
}
