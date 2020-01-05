package ru.khalus.chap03.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Масса в тоннах");
        String aS = Reader.readLine();
        double a = Double.parseDouble(aS);

        //получаем тонны
        int t = (int) a;

        //получаем килограммы
        int k = (int) ((a - t)*1000);

        //получаем граммы
        int g = (int) (((a - t)*1000 - k)*1000);

        System.out.println(t + " " + k + " " + g);

    }
}
