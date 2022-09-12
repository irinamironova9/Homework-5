public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 2022;

        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " год - високосный.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int minDeliveryDays = 1;
        int interval = 40;
        int totalDeliveryDays;
        // Насколько я поняла из условий задачи, первый интервал до 20 км включительно, последующие до 60 км включительно, до 100 км включительно и т.д.)

        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется " + minDeliveryDays + " день.");
        } else if ((deliveryDistance - 20) % interval == 0) {
            totalDeliveryDays = minDeliveryDays + (deliveryDistance - 20) / interval;
            System.out.println("На доставку потребуется " + totalDeliveryDays + " дней.");
        } else {
            totalDeliveryDays = minDeliveryDays + 1 + (deliveryDistance - 20) / interval;
            System.out.println("На доставку потребуется " + totalDeliveryDays + " дней.");
        }

        // Задание 5
        System.out.println("Задание 5");
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
                System.out.println("Такого месяца не существует.");
        }

    }
}