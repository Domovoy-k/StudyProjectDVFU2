package ru.khalus.chap02.task09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите пятизначное число: ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        int N = 2; //количество разрядов, на которое надо сдвинуть число вправо

        // цикл смещения последней цифры на первое место выполняемый N раз
        for (int i = 0; i < N; i++) {
            a = a%10*10000 + (a - a%10)/10;
        }
        System.out.println(a);
    }
}
