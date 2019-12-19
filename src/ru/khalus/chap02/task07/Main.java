package ru.khalus.chap02.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите длину комнаты: ");
        String aS = Reader.readLine();
        double dlina = Double.parseDouble(aS);

        System.out.print("Введите ширину комнаты: ");
        String bS = Reader.readLine();
        double shirina = Double.parseDouble(bS);

        System.out.print("Введите высоту комнаты: ");
        String cS = Reader.readLine();
        double visota = Double.parseDouble(cS);

        //вычисляем площадь стен комнаты (площадь поверхности параллелепипеда минус площади пола и потолка)
        double square = (2*(dlina*shirina + shirina*visota + dlina*visota)) - 2*dlina*shirina;

        double M = 10; //процент окон
        double N = 2; //количество краски на 1 м2 комнаты
        double R = 154; //цена краски

        double itog = (square - (square*M/100))*N;
        double itogR = itog*R;

        System.out.println("Вам потребуется " + itog + " литров краски, которая будет стоить " + itogR + "рублей.");

    }
}
