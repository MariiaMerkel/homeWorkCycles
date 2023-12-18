public class Main {
    public static void main(String[] args) {

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
        int income1 = 29000;
        float savings1 = 0;
        for (int i = 1; i <= 12; i++) {
            savings1 *= 1.01f;
            savings1 += income1;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, savings1);
        }

        System.out.println("\ntask 10:");
        for (int i = 1; i <= 10; i++){
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
    }
}