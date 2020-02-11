package ru.khalus.chap05.task17;

public class EndGame {

    private static boolean end = true;

    public static boolean endgame() {
        System.out.println("Спасибо за игру, до свидания!");
        return false;
    }

    public static boolean getEnd() {
        return end;
    }

    public static void setEnd(boolean end) {
        EndGame.end = end;
    }

}
