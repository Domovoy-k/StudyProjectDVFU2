package ru.khalus.chap05.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите имя Игрока: ");
        String name = Reader.readLine();
        Gamer gamer = new Gamer("name");


        while (gamer.getCredit() > 0) {

            int[] slot = new int[3];
            slot[0] = (int) (Math.random() * 8);
            slot[1] = (int) (Math.random() * 8);
            slot[2] = (int) (Math.random() * 8);

            for (int value : slot) {
                System.out.print(value + " ");
            }

            gamer.setCredit(gamer.getCredit() + firstCase(slot));
            System.out.println();
            gamer.setCredit(gamer.getCredit() - 1000);
        }

    }

    public static int firstCase (int[] slot) {
        if (slot[0] == slot [1] && slot [1] == slot [2]) {
            int y = 1000;
            return y;
        }
        return 0;
    }

    public static int secondCase (int[] slot) {
        if (slot[0] == 5){
            int y = 1000;
            return y;
        }
        return 0;
    }

    public static int thirdCase (int[] slot) {
        if (slot[0] == 7){
            int y = 1000;
            return y;
        }
        return 0;
    }

}
