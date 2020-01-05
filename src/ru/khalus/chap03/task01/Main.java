package ru.khalus.chap03.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите расстояние в километрах: ");
        String sS = Reader.readLine();
        int s = Integer.parseInt(sS);

        System.out.print("Введите скорость в метрах в секунду: ");
        String vS = Reader.readLine();
        int v = Integer.parseInt(vS);

        //переводим километры в метры
        int s2 = s * 1000;

        //получаем время в пути в секундах
        int t = s2 / v;

        //получаем количество часов, минут и секунд
        int hour = t / 3600;
        int minute = (t - hour * 3600) / 60;
        int second = t - hour*3600 - minute * 60;

        System.out.println("Для преодоления указанного расстояния с указанной скоростью необходимо: " + hour + " часов, " + minute + " минут и " + second + " секунд.");

    }
}
