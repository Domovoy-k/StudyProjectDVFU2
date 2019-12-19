package ru.khalus.chap02.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество наличных денег: ");
        String aS = Reader.readLine();
        int sum = Integer.parseInt(aS);

        System.out.print("Введите стоимость товара: ");
        String bS = Reader.readLine();
        double price = Double.parseDouble(bS);

        if (price > sum) {
            System.out.println("У вас маловато денег!");
        } else {
            int quant = (int)(sum/price);
            double balance = sum - price*quant;

            System.out.println("Вы сможете купить " + quant + " штук и у вас останется " + balance);

        }

        //почему так?
        //double i = 33.3*3;
        // System.out.println(i);
    }
}
