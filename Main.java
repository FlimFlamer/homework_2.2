public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 0;
        double percent = 0.0;
        int month = 0;

        while (month < 13) {
            ++month;
            contribution += 29000;
            percent = (double) contribution * 0.01;
            System.out.println("За " + month + " месяц, сумма накоплений равна " + ((double) contribution + percent) + " рублей.");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;

        while (number < 10) {
            ++number;
            System.out.print(number);
        }

        System.out.println();

        for (int numberFor = 10; numberFor > 0; --numberFor) {
            System.out.print(numberFor);
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
        int contribution = 15000;

        double sum;
        for (sum = 0.0; sum <= 1.2E7; sum += (double) contribution) {
            sum = (double) contribution * 0.07;
        }

        System.out.println(sum);
    }
}
