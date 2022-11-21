import java.time.LocalDate;

class MethodsHW {

    // Task 1 method
    public static void calculatesLeapYear(int yearNum) {
        if (((yearNum % 4 == 0) && (yearNum % 100 != 0)) || (yearNum % 400 == 0)) {
            System.out.println(yearNum + " - Is a leap year");
        } else {
            System.out.println(yearNum + " - Is a not leap year");
        }

    }
    // Task 3 method

    public static void calculatesAppVersion(byte OS, int madeDate) {
        if (OS == 0 && madeDate >= 2015) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (OS == 0 && madeDate < 2015) {
            System.out.println("Установите облегченную версию для IOS  по ссылке");
        } else if (OS == 1 && madeDate >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (OS == 1 && madeDate < 2015) {
            System.out.println("Установите облегченное приложение для Android по ссылке");
        }
    }
    public static void countingDeliveryDays(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else {
            if (distance > 20 && distance <= 60) {
                System.out.println("Потребуется дней: " + 2);
            } else if (distance > 60 && distance <= 100) {
                System.out.println("Потребуется дней: " + 3);

            } else {
                System.out.println("Доставка не возможна");
            }
        }
    }

    public static void main(String[] args) {

        // Task 1

        int year = 2022;
        calculatesLeapYear(year);

        // Task 2

        byte clientOS = 1;
        int madeYear = 2012;
        calculatesAppVersion(clientOS, madeYear);

        // Task 3

        int deliveryDistance = 35;
        countingDeliveryDays(deliveryDistance);
    }
}