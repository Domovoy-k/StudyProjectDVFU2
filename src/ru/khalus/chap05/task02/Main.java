package ru.khalus.chap05.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

    //ввод числа
        System.out.print("Введите число: ");
        String aS = Reader.readLine();
        double a = Double.parseDouble(aS);

    //вывод результата после проверки числа
        if (check(a)) {
            System.out.println("число не имеет вещественной части");
        } else {
            System.out.println("число имеет вещественную часть");
        }
    }

    //проверка наличия вещественной части у введенного числа
    static boolean check (double x) {
        return x == (int)x;
    }
}
