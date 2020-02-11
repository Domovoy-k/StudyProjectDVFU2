package ru.khalus.chap05.task17;


public class Game {

    public static void game(Gamer gamer, String x) {

        gamer.setCredit(gamer.getCredit() - 1000);

        int[] slot = new int[3];

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
        gamer.setCredit(gamer.getCredit() + WinLoseCases.fourthCase(slot));

        if (WinLoseCases.fifthCase(slot) == 1) {
            gamer.setCredit(gamer.getCredit() + 1000000);
            System.out.println("ВЫ ЕДИНСТВЕННЫЙ И НЕПОВТОРИМЫЙ ПОБЕДИТЕЛЬ!");
            EndGame.setEnd(false);
        }

        if (WinLoseCases.sixthCase(slot) == 1) {
            gamer.setCredit(0);
            System.out.println("ВЫ ЕДИНСТВЕННЫЙ И НЕПОВТОРИМЫЙ ЛУЗЕР!");
            EndGame.setEnd(false);
        }
    }
}
