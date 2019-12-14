package ru.khalus.chap01.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите Вашу наличность в рублях: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String rS = Reader.readLine();
        int r = Integer.parseInt(rS);

        final double dollar = 62.55;
        final double euro = 69.86;

        double dr = r/dollar;
        double er = r/euro;

        System.out.println("У вас " + dr + " долларов!");
        System.out.println("У вас " + er + " евро!");

    }


}
