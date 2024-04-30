public class Main {
    public static void main(String[] args) {

        //Task 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Задача 1.\nУстановите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Задача 1.\nУстановите версию приложения для Android по ссылке");
        } else {
            System.out.println("Задача 1.\nВы указали данные некорректно");
        }

        //Task 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015 && clientDeviceYear > 0) {
            System.out.println("\nЗадача 2.\nУстановите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("\nЗадача 2.\nУстановите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015 && clientDeviceYear > 0) {
            System.out.println("\nЗадача 2.\nУстановите облегчённую версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear > 0) {
            System.out.println("\nЗадача 2.\nУстановите версию приложения для Android по ссылке.");
        } else {
            System.out.println("\nЗадача 2.\nВы указали данные некорректно");
        }

        //Task 3
        long year = 2016L;
        boolean yearDivBy4 = year % 4 == 0;
        boolean yearDivBy100 = year % 100 != 0;
        boolean yearDivBy400 = year % 400 == 0;
        boolean moreThan1584 = year >= 1584;
        if (moreThan1584 && yearDivBy4 && (yearDivBy100 || yearDivBy400)) {
            System.out.println("\nЗадача 3.\nГод високосный");
        } else {
            System.out.println("\nЗадача 3.\nГод не високосный или вы указали некорректный год.");
        }

        //Task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            System.out.println("\nЗадача 4.\nДоставка будет осуществлена в течение одного дня.");
        } else if (deliveryDistance <= 60 && deliveryDistance >=0) {
            System.out.println("\nЗадача 4.\nДоставка будет осуществлена в течение двух дней.");
        } else if (deliveryDistance <= 100 && deliveryDistance >=0) {
            System.out.println("\nЗадача 4.\nДоставка будет осуществлена в течение трёх дней.");
        } else {
            System.out.println("\nЗадача 4.\nВы слишком далеко или указали некорректные данные.");
        }

        //Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1 :
                System.out.println("\nЗадача 5.\nЯнварь - зимний месяц.");
                break;
            case 2 :
                System.out.println("\nЗадача 5.\nФевраль - зимний месяц.");
                break;
            case 3 :
                System.out.println("\nЗадача 5.\nМарт - весенний месяц.");
                break;
            case 4 :
                System.out.println("\nЗадача 5.\nАпрель - весенний месяц.");
                break;
            case 5 :
                System.out.println("\nЗадача 5.\nМай - весенний месяц.");
                break;
            case 6 :
                System.out.println("\nЗадача 5.\nИюнь - летний месяц.");
                break;
            case 7 :
                System.out.println("\nЗадача 5.\nИюль - летний месяц.");
                break;
            case 8 :
                System.out.println("\nЗадача 5.\nАвгуст - летний месяц.");
                break;
            case 9 :
                System.out.println("\nЗадача 5.\nСентябрь - осенний месяц.");
                break;
            case 10 :
                System.out.println("\nЗадача 5.\nОктябрь - осенний месяц.");
                break;
            case 11 :
                System.out.println("\nЗадача 5.\nНоябрь - осенний месяц.");
                break;
            case 12 :
                System.out.println("\nЗадача 5.\nДекабрь - зимний месяц.");
                break;
            default :
                System.out.println("\nЗадача 5.\nМесяц указан некорректно.");
        }
    }
}