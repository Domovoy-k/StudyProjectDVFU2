package ru.khalus.chap03.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите продолжительность телефонного разговора.");
        System.out.print("Часов: ");
        String hS = Reader.readLine();
        int h = Integer.parseInt(hS);
        System.out.print("Минут: ");
        String mS = Reader.readLine();
        int m = Integer.parseInt(mS);
        System.out.print("Секунд: ");
        String sS = Reader.readLine();
        int s = Integer.parseInt(sS);

        // получаем сколько стоит разговор ы копейках
        int sum = h*60*15 + m*15 + s*4;

        // переводим в рубли и копейки
        int rub = sum/100;
        int kop = sum - rub*100;

        System.out.println("Ваш разговор будет стоить: " + rub + " рублей и " + kop + " копеек.");

    }
}
