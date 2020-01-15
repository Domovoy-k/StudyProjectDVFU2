package ru.khalus.chap04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число \"а\": ");
        String aS = Reader.readLine();
        double a = Double.parseDouble(aS);

        System.out.print("Введите число \"b\": ");
        String bS = Reader.readLine();
        double b = Double.parseDouble(bS);

        System.out.println("1. a + b\n2. a - b\n3. a * b\n4. a / b\n5. a % b");
        System.out.print("Выберите операцию: ");
        String xS = Reader.readLine();
        int x = Integer.parseInt(xS);

        if (x == 1) {
            double c = a + b;
            System.out.println(c);
        } else {
            if (x == 2) {
                double c = a - b;
                System.out.println(c);
            } else {
                if (x == 3) {
                    double c = a * b;
                    System.out.println(c);
                } else {
                    if (x == 4 && b != 0) {
                        double c = a / b;
                        System.out.println(c);
                    } else {
                        if (x == 4 && b == 0) {
                            System.out.println("На ноль делить нельзя!");
                        } else {
                            if (x == 5) {
                                double c = a*b/100;
                                System.out.println(c);
                            }
                        }
                    }
                }
            }
        }

    }
}
