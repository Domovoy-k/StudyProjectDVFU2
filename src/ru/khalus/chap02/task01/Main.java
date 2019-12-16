package ru.khalus.chap02.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //вводим два трехзначных числа
        System.out.print("Введите трехзначное число \"а\": ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        System.out.print("Введите трехзначное число \"b\": ");

        String bS = Reader.readLine();
        int b = Integer.parseInt(bS);

        //получаем десятки первого и второго числа
        int x = (a%100) - (a%100)%10;
        int y = (b%100) - (b%100)%10;

        //меняем их местами
        a = a - x + y;
        b = b - y + x;

        //выводим результат на экран
        System.out.println(a + "  " + b);
    }
}
