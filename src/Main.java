import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("\ntask 1: ");

        float savings = 0;
        int deferred = 15_000;
        int monthNumber = 0;
        while (savings <= 2_459_000) {
            savings *= 1.01f;
            savings += deferred;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", ++monthNumber, savings);
        }


        System.out.println("\ntask 2: ");

        int i = 0;
        while (i < 10) {
            System.out.printf("%d ", ++i);
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.printf("%d ", i);
        }


        System.out.println("\ntask 3: ");

        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int deathRate = population / 1000 * 8;
        for (int j = 1; j <= 10; j++) {
            population = population + birthRate - deathRate;
            System.out.printf("За %d год, численность населения составляет %d человек. %n", j, population);
        }


        System.out.println("\ntask 4: ");

        savings = 15_000;
        monthNumber = 0;
        while (savings <= 12_000_000) {
            savings *= 1.07f;
            savings += deferred;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", ++monthNumber, savings);
        }


        System.out.println("\ntask 5: ");

        savings = 15_000;
        monthNumber = 0;
        while (savings <= 12_000_000) {
            savings *= 1.07f;
            savings += deferred;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", monthNumber, savings);
            }
        }


        System.out.println("\ntask 6: ");

        savings = 15_000;
        for (monthNumber = 1; monthNumber <= 9 * 12; monthNumber++) {
            savings *= 1.07f;
            savings += deferred;
            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", monthNumber, savings);
            }
        }


        System.out.println("\ntask 7: ");

        for (int dayOfFriday = 1; dayOfFriday <= 7; dayOfFriday++) {
            System.out.println();
            for (i = dayOfFriday; i <= 31; i += 7) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", i);
            }
        }


        System.out.println("\ntask 8: ");

        int currentYear = LocalDateTime.now().getYear();
        for (int cometYear = 0; cometYear <= currentYear + 79; cometYear += 79) {
            if (cometYear > currentYear - 200) System.out.println(cometYear);
        }
    }
}