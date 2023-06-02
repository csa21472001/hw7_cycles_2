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
        int goal = 2_459_000;
        int monthlyFee = 15000;
        int month = 0;
        while (total < goal) {
            total = total + monthlyFee;
            month++;
            System.out.println(" Месяц " + month + " сумма накопления равна " + total + " рублей");
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
        int totalPeople = 12_000_000;
        int birthRate = 17 ;
        int deathRate = 8 ;
        int year = 0;
        while (year < 10) {
            totalPeople = totalPeople + (totalPeople/1000)*(birthRate - deathRate);
            year++;
            System.out.println(" Год " + year + " численность населения составляет " + totalPeople);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double totalDeposit = 15000.0;
        double percent = 7.0;
        int goal = 12_000_000;
        int month = 0;
        while (totalDeposit < goal) {
            totalDeposit = totalDeposit + totalDeposit*percent/100;
            month++;
            System.out.printf(" Месяц %d сумма накоплений составляет %.3f ", month, totalDeposit);
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double totalDeposit = 15000.0;
        double percent = 7.0;
        int goal = 12_000_000;
        int month = 0;
        while (totalDeposit < goal) {
            totalDeposit = totalDeposit + totalDeposit*percent/100;
            month++;
            if (month % 6 == 0) {
                System.out.printf(" Месяц %d сумма накоплений составляет %.3f ", month, totalDeposit);
                System.out.println();
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double totalDeposit = 15000.0;
        double percent = 7.0;
        int durationOfDeposit = 9 * 12;
        int month = 0;
        while (month < durationOfDeposit) {
            totalDeposit = totalDeposit + totalDeposit*percent/100;
            month++;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма накоплений составляет " + totalDeposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;// первая пятница месяца
        int daysInMonth = 31;
        for (;friday <= daysInMonth; friday+=7) {
            System.out.println(" Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearWithAComet = 0;
        int currentYear = 2023;
        for (;yearWithAComet <= currentYear + 100; yearWithAComet += 79) {
            if (yearWithAComet <= currentYear+100 && yearWithAComet>= currentYear-200) {
                System.out.println( yearWithAComet + " год. Комета пролетела");
            }
        }
    }


}

