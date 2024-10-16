public class Main {
    public static void main(String[] args) {

// task 1

        {
            System.out.println("Задание 1");
        }

        int total = 0;
        int month = 0;
        int vBanky = 15000;

        while (total <= 2459000) {
            total = total + vBanky;
            month++;

        }
        {
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        // task 2

        {
            System.out.println("задание 2");
        }

        int i = 1;

        for (; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }

        // task 3

        {
            System.out.println("задание 3");
        }

        int year = 2024;
        int y = 12000000;
        int birthInYear = y / 1000 * 17;
        int deathInYear = y / 1000 * 8;

        while (year <= 2034) {
            year++;
            y = y + birthInYear - deathInYear;
        }

        System.out.println("Год " + year + ", численность населения составит " + y);

        // Task 4

        {
            System.out.println("Задание 4");
        }

        total = 15000;
        month = 0;
        int percentInMonth = 0;

        while (total <= 12000000) {
            percentInMonth = total / 100 * 7;
            total = total + percentInMonth;
            month++;

            System.out.println("В " + month + " месяц сумма вклада составляет " + total);

        }

        // Task 5

        {
            System.out.println("Задание 5");
        }
        total = 15000;
        month = 0;
        percentInMonth = 0;

        while (total <= 12000000) {
            percentInMonth = total / 100 * 7;
            total = total + percentInMonth;
            month++;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяц сумма вклада составляет " + total);
            }
        }

        // Task 6

        {
            System.out.println("Задание 6");
        }

        total = 15000;
        month = 0;
        percentInMonth = 0;

        // не уверен что необхода проверка на 12млн, но решил оставить. Что наступит быстрее. Из задания не ясно.
        // с одной стороны модифицировать программу и тогда проверка на сумму должна остаться
        // while (month <= (9 * 12) - так будет если просто надо за 9 лет посчитать.

        while (total <= 12000000 || month <= (9 * 12)) {
            percentInMonth = total / 100 * 7;
            total = total + percentInMonth;
            month++;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяц сумма вклада составляет " + total);
            }
        }

        // Task 7

        {
            System.out.println("Задание 7");
        }




    }
}