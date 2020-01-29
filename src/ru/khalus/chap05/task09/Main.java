package ru.khalus.chap05.task09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите день: ");
        String dS = Reader.readLine();
        int d = Integer.parseInt(dS);

        System.out.print("Введите месяц: ");
        String mS = Reader.readLine();
        int m = Integer.parseInt(mS);

        System.out.print("Введите год: ");
        String yS = Reader.readLine();
        int y = Integer.parseInt(yS);

        if (CheckDayMonthYear(d, m, y))
            System.out.print("Следующий день: " + NextDay(d, m, y));
        else
            System.out.println("Введеная дата некорректна");

    }

    //проверка правильности введения даты
    static boolean CheckDayMonthYear (int x, int y, int z) {
        switch (y) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return x >= 1 && x <= 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return x >= 1 && x <=30;

            case 2:
                if ((z%4 == 0) && !(z%100 == 0) || (z%400 == 0)) {
                    return x >= 1 && x <= 29;
                } else {
                    return x >= 1 && x <= 28;
                }
            default:
                return false;
        }
    }

    //вычисление следующего дня
    static String NextDay (int x, int y, int z) {
        int day = x;
        int month = y;
        int year = z;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    day = day + 1;
                } else {
                    day = 1;
                    month = month + 1;
                }
                return day + "." + month + "." + year;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    day = day + 1;
                } else {
                    day = 1;
                    month = month + 1;
                }
                return day + "." + month + "." + year;

            case 2:
                if (((year%4 == 0) && (year%400 ==0) || !(year%100 == 0)) && day < 29) {
                    day = day + 1;
                } else {
                    day = 1;
                    month = month + 1;
                }
                return day + "." + month + "." + year;
            case 12:
                if (day < 31) {
                    day = day + 1;
                } else {
                    day = 1;
                    month = 1;
                    year = year + 1;
                }
                return day + "." + month + "." + year;
            default:
                return "што-то пошло не так...";
        }
    }


}
