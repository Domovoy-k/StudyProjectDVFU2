package ru.khalus.chap03.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Сколько секунд прошло с начала рабочего дня?");
        String sS = Reader.readLine();
        int s = Integer.parseInt(sS);

        int ostatok = (8*3600 - s)/3600;
        System.out.println("Вам осталось работать " + ostatok + " полных часов.");

    }
}
