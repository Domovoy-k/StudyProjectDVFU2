package ru.khalus.chap04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число: ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        if (a%2 == 0) {
            System.out.println("Ваше число положительное!");
        } else {
            System.out.println("Ваше число отрицательное!");
        }

    }
}
