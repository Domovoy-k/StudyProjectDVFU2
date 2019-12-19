package ru.khalus.chap02.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите трехзначное число: ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        int first = (a - a%100)/100;
        int second = (a%100 - (a%100)%10)/10;
        int third = a%10;

        //System.out.println(first + " " + second + " " + third);

        int result = first*10 + third;

        System.out.println(result);

    }
}
