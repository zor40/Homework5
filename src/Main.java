//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println("Task 2");
        int clientOperatingSystem = 0;
        int clientDeviceYear = 2014;
        if (clientOperatingSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOperatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOperatingSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        System.out.println("Task 3");
        int year = 2024;
            if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                System.out.println(year + " год является високосным.");
            } else if (year > 1584) {
                System.out.println(year + " год не является високосным.");
            } else {
                System.out.println("Год должен быть больше, чем 1584.");
            }
            System.out.println("Task 4");
            int deliveryDistance = 95;
            int deliveryDay = 1;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется " + deliveryDay + " день.");
            }
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryDay += 1;
                System.out.println("Потребуется " + deliveryDay + " дня.");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDay += 2;
                System.out.println("Потребуется " + deliveryDay + " дня.");
            }
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет.");
            }
            System.out.println("Task 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень.");
                    break;
                default:
                    System.out.println("Такого месяца нет.");
            }



        }
    }

