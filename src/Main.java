public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
        System.out.println(" ");
        task5();
        System.out.println(" ");

    }

    private static void task1() {
        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }

    private static void task3() {
        System.out.println("Задача 3");

        int year = 2021;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else
            System.out.println(year + " год не является високосным.");
    }

    private static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int countOfDeliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + countOfDeliveryDays);
        } else if (deliveryDistance > 20  && deliveryDistance <= 60) {
            countOfDeliveryDays = countOfDeliveryDays+1;
            System.out.println("Потребуется дней: " + countOfDeliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            countOfDeliveryDays = countOfDeliveryDays+2;
            System.out.println("Потребуется дней: " + countOfDeliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");}
    }

    private static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
