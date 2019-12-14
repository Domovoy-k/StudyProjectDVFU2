package ru.khalus.chap01.task09;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final double earth = 1.609;
        final double sea = 1.852;

        double km = 346;

        double eMiles = km/earth;
        double sMiles = km/sea;

        System.out.println(eMiles);
        System.out.println(sMiles);

    }
}
