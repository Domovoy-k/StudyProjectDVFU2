package ru.khalus.chap03.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество секунд: ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        int day = a / 86400;
        int hour = (a - day*86400)/3600;
        int minute = (a - day*86400 - hour*3600)/60;
        int second = a - day*86400 - hour*3600 - minute*60;

        System.out.println(day + " " + hour + " " + minute + " " + second);

    }
}
