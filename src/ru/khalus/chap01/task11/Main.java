package ru.khalus.chap01.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        final double Pi = 3.1415926536;

        System.out.print("Укажите длину отрезка проволоки: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String cS = Reader.readLine();
        int c = Integer.parseInt(cS);

        double d = c/Pi;

        System.out.println(d);

    }
}
