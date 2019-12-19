package ru.khalus.chap02.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите четырехзначное число \"а\": ");

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        int first = (a - a%1000)/1000;
        int second = (a%1000 - (a%1000)%100)/100;
        int third = (a%100 - (a%100)%10)/10;
        int fourth = a%10;

        // System.out.println(first + " " + second + " " + third + " " + fourth);

        int sum = first + third;
        int substr = second - fourth;


    }
}
