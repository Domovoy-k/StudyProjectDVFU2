package ru.khalus.chap01.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите двузначное натуральное число: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        int x = (a - a%10)/10;

        System.out.println("Количество десятков в данном числе: " + x);
    }
}
