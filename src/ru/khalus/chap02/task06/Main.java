package ru.khalus.chap02.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        final double funt = 405.9;

        System.out.print("Введите количество фунтов: ");
        String aS = Reader.readLine();
        double funts = Double.parseDouble(aS);

        double kilos = funts*funt/1000;

        System.out.println("У вас: " + kilos + " кг.");

        System.out.print("Введите количество киллограмм: ");
        String bS = Reader.readLine();
        double kilos2 = Double.parseDouble(bS);

        double funts2 = kilos2*1000/funt;

        System.out.println("У вас: " + funts2 + " ф.");

    }
}
