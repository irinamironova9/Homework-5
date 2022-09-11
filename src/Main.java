public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int client_OS = 1;
        int clientDeviceYear = 2014;

        if (client_OS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 2022;

        if (year % 4 == 0 && year % 100 !=0) {
            System.out.println(year + " год - високосный.");
        } else if (year % 4 != 0 || year % 400 != 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год - високосный.");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 60;
        int minDeliveryDays = 1;
        int interval = 40;
        int totalDeliveryDays;

        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется " + minDeliveryDays + " день.");
        } else {
            totalDeliveryDays = minDeliveryDays + 1 + (deliveryDistance - 20) / interval;
            System.out.println("На доставку потребуется " + totalDeliveryDays + " дней.");
        }

    }
}