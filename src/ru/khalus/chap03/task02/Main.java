package ru.khalus.chap03.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите два дробных числа:");
        String aS = Reader.readLine();
        double a = Double.parseDouble(aS);

        String bS = Reader.readLine();
        double b = Double.parseDouble(bS);

        //получаем сумму целых частей
        int sum = (int) a + (int) b;

        //получаем сумму дробных частей
        double sum2 = (a - (int) a) + (b - (int) b);

        System.out.println(sum + " " + sum2);

    }
}
