package ru.khalus.chap01.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Укажите количество градусов по Цельсию: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String cS = Reader.readLine();
        double c = Double.parseDouble(cS);
            if (c < -273.15) {
                System.out.println("Температуры ниже абсолютного нуля не бывает!");
            } else {
                double far = (9.0/5.0)*c + 32;
                double k = c + 273.15;
                double reo = (4.0/5.0)*c;
                double del = (100 - c)*(3.0/2.0);

                System.out.println("Указанная температура по Фаренгейту равна: " + far);
                System.out.println("Указанная температура по Кельвину равна: " + k);
                System.out.println("Указанная температура по Реомюру равна: " + reo);
                System.out.println("Указанная температура по Делилю равна: " + del);
            }

        System.out.print("Укажите количество градусов по Фаренгейту: ");

        String fS = Reader.readLine();
        double f = Double.parseDouble(fS);
        if (f < -459.67) {
            System.out.println("Температуры ниже абсолютного нуля не бывает!");
        } else {
            double cel = (5.0/9.0)*(f - 32);
            System.out.println("Указанная температура по Цельсию равна: " + cel);
        }
    }
}
