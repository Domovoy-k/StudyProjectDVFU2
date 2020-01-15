package ru.khalus.chap03.task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        GregorianCalendar now = new GregorianCalendar();

        System.out.println("Сколко прошло дней?");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        now.add(GregorianCalendar.DATE, a);

        System.out.println(now.get(Calendar.DATE));
    }
}
