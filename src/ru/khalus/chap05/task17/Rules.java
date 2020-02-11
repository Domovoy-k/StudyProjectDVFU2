package ru.khalus.chap05.task17;

public class Rules {

    public static void rulesMain() {
        System.out.println("Правила игры:");
        System.out.println("Ваш стартовый бюджет - 5000 кредитов, стоимость одной игры - 1000 кредитов\n");
        rules();

    }

    public static void rules() {
        System.out.println("Выигрышные комбинации:");
        System.out.println("\t5хх - 1000 кредитов");
        System.out.println("\t7хх - 3000 кредитов");
        System.out.println("\tтри одинаковые - 5000 кредитов");
        System.out.println("\t555 - 10000 кредитов");
        System.out.println("\t777 - 1000000 кредитов и Вы объявляетесь безоговорочным победителем");
        System.out.println("\t666 - Ваши кредиты сгорают и Вы объявляетесь безоговорочным лузером");
    }

}
