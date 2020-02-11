package ru.khalus.chap05.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void click(Gamer gamer) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(gamer.getName() + ", Ваш кредит составляет: " + gamer.getCredit());
        System.out.println("Для продолжения игры нажмите \"z\"");
        System.out.println("Для выхода из игры нажмите \"x\"");
        System.out.println("Для просмотра правил нажмите \"r\"");
        String button = Reader.readLine();

        if (button.equals("z")) {
            Game.game(gamer, button);
            } else {
            if (button.equals("x")) {
                EndGame.setEnd(false);
            } else {
                if (button.equals("r")) {
                    Rules.rules();
                } else {
                    System.out.println("Я не понимаю Вашей команды :(");
                    System.out.println();
                }
            }
        }

    }
}
