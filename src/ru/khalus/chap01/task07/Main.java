package ru.khalus.chap01.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        final double Pi = 3.1415926536;

        System.out.print("Введите радиус окружности: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String rS = Reader.readLine();
        int r = Integer.parseInt(rS);

        double square = Pi*r*r;
        double length = 2*Pi*r;

        System.out.println("Площадь окружности с радиусом " + r + " = " + square);
        System.out.println("Длина окружности с радиусом " + r + " = " + length);

    }
}
