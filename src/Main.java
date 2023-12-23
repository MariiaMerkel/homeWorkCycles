import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("\ntask 1: ");

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        float savings = 0;
        int deferred = 15_000;
        int monthNumber = 0;
        while (savings <= 2_459_000) {
            savings *= 1.01f;
            savings += deferred;
            System.out.printf("Месяц %d, сумма накоплений равна %s%n", ++monthNumber, numberFormat.format(savings));
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
        int birthRate;
        int deathRate;
        for (int j = 1; j <= 10; j++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population = population + birthRate - deathRate;
            System.out.printf("За %d год, численность населения составляет %d человек. %n", j, population);
        }


        System.out.println("\ntask 4: ");

        savings = 15_000;
        monthNumber = 0;
        while (savings <= 12_000_000) {
            savings *= 1.07f;
            savings += deferred;
            System.out.printf("Месяц %d, сумма накоплений равна %s%n", ++monthNumber, numberFormat.format(savings));
        }


        System.out.println("\ntask 5: ");

        savings = 15_000;
        monthNumber = 0;
        while (savings <= 12_000_000) {
            savings *= 1.07f;
            savings += deferred;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %s%n", monthNumber, numberFormat.format(savings));
            }
        }


        System.out.println("\ntask 6: ");

        savings = 15_000;
        for (monthNumber = 1; monthNumber <= 9 * 12; monthNumber++) {
            savings *= 1.07f;
            savings += deferred;
            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %s%n", monthNumber, numberFormat.format(savings));
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

        int period = 79;
        int currentYear = LocalDateTime.now().getYear();
        int startYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (int cometYear = 0; cometYear <= nextYear; cometYear += period) {
            if (cometYear > startYear) System.out.println(cometYear);
          
          
        System.out.println("\ntask 1:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\ntask 2:");
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\ntask 3:");
        for (int i = 0; i <= 17; i += 2) {
            if (i != 0) System.out.println(i);
        }

        System.out.println("\ntask 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\ntask 5:");
        for(int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("\ntask 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\ntask 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\ntask 8:");
        int income = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings += income;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("\ntask 9:");
        int attachment = 29000;
        float savingsResult = 0;
        for (int i = 1; i <= 12; i++) {
            savingsResult *= 1.01f;
            savingsResult += attachment;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, savingsResult);
        }

        System.out.println("\ntask 10:");
        for (int i = 1; i <= 10; i++){
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
    }
}