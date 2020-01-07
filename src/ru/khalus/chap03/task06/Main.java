package ru.khalus.chap03.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите расстояние в километрах: ");
        String sS = Reader.readLine();
        int s = Integer.parseInt(sS);

        System.out.print("Введите время в минутах: ");
        String tS = Reader.readLine();
        double t = Double.parseDouble(tS);

        double v = s*60 / t;

        System.out.println("Для преодоления указанного расстояния за указанное время Вам необходимо передвигаться со скоростью: " + v + " километров в час");
    }
}
