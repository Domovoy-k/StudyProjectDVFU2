package ru.khalus.chap05.task17;

public class Gamer {
    private String name;
    private int credit = 5000;

    public Gamer (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


}
