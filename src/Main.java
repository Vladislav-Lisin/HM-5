public class Main {
    public static void main(String[] args) {
        // task 1
        int clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
        }

        // task 2
        int  clientDeviceYear = 2016;
        clientOS = 1;
        if (clientDeviceYear < 2015){
            switch (clientOS) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
            }
        }
        else switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
        }
        // task 3
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }
        else
            System.out.println(year + " год не является високосным");

        // task 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100 ) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }

        // task 5
        int  monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Данный месяц принадлежит к сезону зимы");
                break;
            case 2:
                System.out.println("Данный месяц принадлежит к сезону зимы");
                break;
            case 3:
                System.out.println("Данный месяц принадлежит к сезону весны");
                break;
            case 4:
                System.out.println("Данный месяц принадлежит к сезону весны");
                break;
            case 5:
                System.out.println("Данный месяц принадлежит к сезону весны");
                break;
            case 6:
                System.out.println("Данный месяц принадлежит к сезону лета");
                break;
            case 7:
                System.out.println("Данный месяц принадлежит к сезону лета");
                break;
            case 8:
                System.out.println("Данный месяц принадлежит к сезону лета");
                break;
            case 9:
                System.out.println("Данный месяц принадлежит к сезону осени");
                break;
            case 10:
                System.out.println("Данный месяц принадлежит к сезону осени");
                break;
            case 11:
                System.out.println("Данный месяц принадлежит к сезону осени");
                break;
            case 12:
                System.out.println("Данный месяц принадлежит к сезону зимы");
                break;


        }
    }
}