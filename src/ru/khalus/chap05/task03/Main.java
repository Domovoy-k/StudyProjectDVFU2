package ru.khalus.chap05.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        //получение данных
        System.out.print("Введите номер дня недели: ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        //вывод на экран результата реализации метода
        System.out.println(convert(a));

    }

    //метод перевода номера дня недели в текст
    static String convert (int x) {
        String DayString;
        switch (x) {
            case 1: DayString = "Понедельник";
            break;
            case 2: DayString = "Вторник";
            break;
            case 3: DayString = "Среда";
            break;
            case 4: DayString = "Четверг";
            break;
            case 5: DayString = "Пятница";
            break;
            case 6: DayString = "Суббота";
            break;
            case 7: DayString = "Воскресенье";
            break;
            default: DayString = "Вы не с Земли?";
            break;
        }
        return DayString;
    }
}
