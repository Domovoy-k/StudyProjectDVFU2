package ru.khalus.chap01.task13;

public class Main {
    public static void main(String[] args) {

        // Поменять местами с использованием третьей переменной
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);

        // Поменять местами без переменной
        int x = 1;
        int y = 2;
        x = x + y;
        y = x - y;
        x = x- y;
        System.out.println(x + " " + y);
    }
}
