package ru.khalus.chap05.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void game(Gamer gamer, String x) throws IOException {

        gamer.setCredit(gamer.getCredit() - 1000);

        int[] slot = new int[3];

        /*
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = Reader.readLine();
        slot[0] = Integer.parseInt(aS);
        String bS = Reader.readLine();
        slot[1] = Integer.parseInt(bS);
        String cS = Reader.readLine();
        slot[2] = Integer.parseInt(cS);
        */

        slot[0] = (int) (Math.random() * 8);
        slot[1] = (int) (Math.random() * 8);
        slot[2] = (int) (Math.random() * 8);

        for (int value : slot) {
            System.out.print(value + " ");
        }
        System.out.println();
        gamer.setCredit(gamer.getCredit() + WinLoseCases.firstCase(slot));
        gamer.setCredit(gamer.getCredit() + WinLoseCases.secondCase(slot));
        gamer.setCredit(gamer.getCredit() + WinLoseCases.thirdCase(slot));
    }
}
