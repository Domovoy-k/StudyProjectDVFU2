package ru.khalus.chap04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите один символ: ");
        String a = Reader.readLine();

        char x = a.charAt(0);

        if (Character.isDigit(x)) {
            System.out.println("Это цифра");
        } else {
            if (Character.isLetter(x)) {
                System.out.println("Это буква");
            } else {
                System.out.println("Это знак пунктуации");
            }
        }
    }
}
