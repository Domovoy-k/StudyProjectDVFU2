package ru.khalus.chap02.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите трехзначное число: ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        //получаем цифры
        int first = (a - a%100)/100;
        int second = (a%100 - a%10)/10;
        int third = a%10;

        //переворачиваем
        int focus = third*100 + second*10 + first;

        System.out.println("Вжух и свершилась магия... " + focus);

    }
}
