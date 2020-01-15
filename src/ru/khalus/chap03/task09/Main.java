package ru.khalus.chap03.task09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите стоимость ноутбука: ");
        String aS = Reader.readLine();
        double a = Double.parseDouble(aS);

        System.out.print("Введите количество: ");
        String bS = Reader.readLine();
        int b = Integer.parseInt(bS);

        System.out.print("Введите процент скидки: ");
        String cS = Reader.readLine();
        double c = Double.parseDouble(cS);

        //размер скидки
        double x = a*b*c/100;

        //итоговая цена
        double y = a*b - x;

        System.out.println("Общая сумма заказа: " + y);

    }
}
