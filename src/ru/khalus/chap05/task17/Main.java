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

        while (gamer.getCredit() > 0 && EndGame.getEnd()) {

            Menu.click(gamer);

            }
        
        EndGame.endgame();

    }

}
