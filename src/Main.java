import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // task 1
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d ", i++);
        }
        System.out.println();
        for (; i > 1; ) {
            System.out.printf("%d ", --i);
        }

        // task 2
        System.out.println();
        int dayOfFriday = 1;
        for (; dayOfFriday <= 7; dayOfFriday++) {
            System.out.println();
            for (i = dayOfFriday; i <= 31; i += 7) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", i);
            }
        }

        // task 3
        System.out.println();
        int currentYear = LocalDateTime.now().getYear();
        for (int cometYear = 0; cometYear <= currentYear + 79; cometYear += 79) {
            if (cometYear > currentYear - 200) System.out.println(cometYear);
        }
    }
}