package ru.khalus.chap04.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("введите число: ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        if (check(a)) {
            System.out.println("Входит");
        } else {
            System.out.println("Не входит");
        }

    }

    // проверка попадания числа в необходимый промежуток от N до M
    static boolean check (int a) {
        int N = 3;
        int M = 46;
        return a >= N && a <= M;
    }
}
