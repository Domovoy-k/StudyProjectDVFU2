package ru.khalus.chap05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        //получение координат точек
        System.out.println("Введите координаты точек прямой линии:");
        System.out.print("А x = ");
        String axS = Reader.readLine();
        int ax = Integer.parseInt(axS);

        System.out.print("А y = ");
        String ayS = Reader.readLine();
        int ay = Integer.parseInt(ayS);

        System.out.print("B x = ");
        String bxS = Reader.readLine();
        int bx = Integer.parseInt(bxS);

        System.out.print("B y = ");
        String byS = Reader.readLine();
        int by = Integer.parseInt(byS);

        if (ay == by) {
            System.out.println("прямая параллельна оси ординат");
        } else {
            if (ax == bx) {
                System.out.println("прямая параллельна оси абсцисс");
            } else {
                System.out.println("прямая не параллельна координатной сетке");
            }
        }


    }

}
