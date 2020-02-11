package ru.khalus.chap05.task17;

public class EndGame {

    //завершение игры

    private static boolean end = true;

    public static void endgame() {
        System.out.println("Спасибо за игру, до свидания!");
    }

    public static boolean getEnd() {
        return end;
    }

    public static void setEnd(boolean end) {
        EndGame.end = end;
    }

}
