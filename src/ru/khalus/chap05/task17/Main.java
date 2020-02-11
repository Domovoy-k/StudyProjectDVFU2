package ru.khalus.chap05.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Добро пожаловать в Игру!\n");

        //вызов правил игры
        Rules.rulesMain();

        System.out.print("\nВведите имя Игрока: ");
        Gamer gamer = new Gamer(Reader.readLine());

        while (gamer.getCredit() > 0 && EndGame.getEnd()) {

            //отработка кнопок игрового пульта
            Menu.click(gamer);

            }

        //завершение игры
        EndGame.endgame();

    }

}
