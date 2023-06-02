// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
//        task9();
//        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int monthlyFee = 15000;
        int i = 0;
        while (total < 2459000) {
            total = total + monthlyFee;
            i++;
            System.out.println(" Месяц " + i + " сумма накопления равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        while (i > 0) {
            i--;
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeople = 12000000;
        int birthRate = 17 * (12000000 / 1000);
        int deathRate = 8 * (12000000 / 1000);
        int i = 0;
        while (i < 10) {
            totalPeople = totalPeople + (birthRate - deathRate);
            i++;
            System.out.println(" Год " + i + " численность населения составляет " + totalPeople);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double totalDeposit = 15000.0;
        int i = 0;
        while (totalDeposit < 12_000_000) {
            totalDeposit = totalDeposit * 1.07;
            i++;
            System.out.printf(" Месяц %d сумма накоплений составляет %.3f ", i, totalDeposit);
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double totalDeposit = 15000.0;
        int i = 0;
        while (totalDeposit < 12_000_000) {
            totalDeposit = totalDeposit * 1.07;
            i++;
            if (i % 6 == 0) {
                System.out.printf(" Месяц %d сумма накоплений составляет %.3f ", i, totalDeposit);
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double totalDeposit = 15000.0;
        int durationOfDeposit = 9 * 12;
        int i = 0;
        while (i <= durationOfDeposit) {
            totalDeposit = totalDeposit + totalDeposit * 0.07;
            i++;
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " сумма накоплений составляет " + totalDeposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;// первая пятница месяца
        //int i = 1;
        while (friday <= 31) {
            System.out.println(" Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int i = 0;
        while (i <= 2123) {
            if (i <= 2123 && i >= 1823) {
                System.out.println(" Сегодня заканчивается " + i + " год. Комета пролетела");
            }
            i += 79;
        }
    }


}

