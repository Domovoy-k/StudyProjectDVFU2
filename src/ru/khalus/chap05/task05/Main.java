package ru.khalus.chap05.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите номер трамвайного билета (шестизначное число): ");
        String aS = Reader.readLine();
        int a = Integer.parseInt(aS);

        if (check(DecompileNumber(a))) {
            System.out.println("Ваш билетик счастливый!");
        } else {
            System.out.println("Вам не повезло...");
        }

    }

    //метод разбивания числа на цифры и помещение его в массив (правда задом наперед)
    static int[] DecompileNumber (int number) {
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)(number%Math.pow(10, (i + 1))) - (int)(number%Math.pow(10, i))) / (int)(Math.pow(10, i));
        }
        return a;
    }

    //проверка на совпадение сумм первых и вторых трех цифр
    static boolean check (int[] arr) {
        return arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5];
    }
}
