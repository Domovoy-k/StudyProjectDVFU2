package ru.khalus.chap05.task17;

public class WinLoseCases {

    public static int firstCase (int[] slot) {
        if ((slot[0] == slot [1] && slot [1] == slot [2]) && (slot[0] != 5 && slot[0] != 7 && slot[0] != 6)) {
            return 5000;
        }
        return 0;
    }

    public static int secondCase (int[] slot) {
        if (slot[0] == 5){
            return 1000;
        }
        return 0;
    }

    public static int thirdCase (int[] slot) {
        if (slot[0] == 7){
            return 3000;
        }
        return 0;
    }

    public static int fourthCase (int[] slot) {
        if ((slot[0] == slot [1] && slot [1] == slot [2]) && slot[0] == 5) {
            return 10000;
        }
        return 0;
    }

    public static int fifthCase (int[] slot) {
        if ((slot[0] == slot [1] && slot [1] == slot [2]) && slot[0] == 7) {
            return 1;
        }
        return 0;
    }

    public static int sixthCase (int[] slot) {
        if ((slot[0] == slot [1] && slot [1] == slot [2]) && slot[0] == 6) {
            return 1;
        }
        return 0;
    }


}
