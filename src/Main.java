public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int totalContribution = 2459000;
        int contribution = 15000;
        int sum = 0;
        int month = 0;
        double percent = 0.01;

        while (sum <= totalContribution) {
            sum += contribution + sum * percent;
            System.out.println("За " + month + " месяц, сумма накоплений равна " + sum + " рублей.");
            month++;
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;

        while (number < 10) {
            ++number;
            System.out.print(number + " ");
        }

        System.out.println();

        for (int numberFor = 10; numberFor > 0; --numberFor) {
            System.out.print(numberFor + " ");
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int naturalProfit = fertility - mortality;

        for (int year = 1; year <= 10; ++year) {
            population += population * naturalProfit / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15000;
        double percent = 0.07;
        int totalContribution = 12_000_000;
        int mouth = 1;
        while (contribution <= totalContribution) {
            contribution += contribution * percent;
            System.out.println("Месяц " + mouth + ", сумма накоплений: " + contribution);
            mouth++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15000;
        double percent = 0.07;
        int totalContribution = 12_000_000;
        int mouth = 1;
        while (contribution <= totalContribution) {
            contribution += contribution * percent;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + ", сумма накоплений: " + contribution);
            }
            mouth++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        double percent = 0.07;
        int totalContribution = 12_000_000;
        int monthPerYear = 9 * 12;
        int mouth = 1;
        while (mouth <= monthPerYear) {
            contribution += contribution * percent;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + ", сумма накоплений: " + contribution);
            }
            mouth++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        int day = 31;
        while (friday <= day) {
            System.out.println("Сегодня пятница " + friday + "-е число, неободимо подготовить отчёт.");
            friday += 7;
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int thisYear = 2022;
        int givenYear = thisYear - 200;
        int nextYear = thisYear + 100;
        for (int year = givenYear; year <= nextYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }

}
