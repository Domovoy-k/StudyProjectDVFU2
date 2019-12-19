package ru.khalus.chap02.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите cумму: ");
        String aS = Reader.readLine();
        int sum = Integer.parseInt(aS);

        System.out.print("Введите годовые проценты: ");
        String bS = Reader.readLine();
        double perc = Double.parseDouble(bS);

        double monthSum = ((sum*perc)/100 + sum)/12;

        System.out.println("В месяц вы будете получат: " + monthSum);

    }
}
