package ru.khalus.chap03.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Сколько у Вас денег? (в рублях и копейках дробным числом)");
        String aS = Reader.readLine();
        double a = Double.parseDouble(aS);

        //получаем количество рублей
        int r = (int) a;

        //получаем количество копеек
        int k = (int) ((a - r)*100);

        System.out.println("У Вас сейчас: " + r + " рублей и " + k + " копеек.");

    }
}
