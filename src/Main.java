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
        int year = 2016;
        clientOS = 1;
        if (year < 2015){
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

    }
}