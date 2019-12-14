package ru.khalus.chap01.task06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("Введите число: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        System.out.print("Введите степень: ");

        String bS = Reader.readLine();
        int b = Integer.parseInt(bS);

        int x = a;

        for (int i = 1; i < b; i++) {
            a = a*x;
        }
        System.out.println(a);

    }
}
