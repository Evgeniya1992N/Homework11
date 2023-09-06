public class Main {

    //Task 1
    public static String checkYear(int year) {
        String result;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            result = year + " год является високосным";
        } else {
            result = year + " год не является високосным";
        }
        return result;
    }

    //Task 2


    public static String checkPhoneModel(int[] phoneData) {
        String result;
        int clientDeviceYear = 2015;
        if (phoneData[0] != 0)
        {
            if (phoneData[1] <= clientDeviceYear) {
                result = "Установите облегченную версию приложения для Android по ссылке";
            } else {
                result ="Установите версию приложения для Android по ссылке";
            }
        } else {
            if (phoneData[1] <= clientDeviceYear) {
                result = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                result = "Установите версию приложения для iOS по ссылке";
            }
        }
        return result;
        }
 //Task 3
 public static String calculateDeliveryDistance(int deliveryDistance) {
        String expTime;
     if (deliveryDistance <= 20 ) {
         expTime = "Потребуется дней: " + 1;
     }
     else if (deliveryDistance > 20 && deliveryDistance <= 60)  {
         expTime = "Потребуется дней: " + 2;
     }
     else if (deliveryDistance > 60 && deliveryDistance <= 100)  {
         expTime = "Потребуется дней: " + 3;
     }
     else {
         expTime = "доставки нет";
     }
        return expTime;
 }

    public static void main(String[] args) {
        int[] phoneData = {0, 2000};
        int deliveryDistance = 95;
           String answerYearType = checkYear(2019);
           String recommendation = checkPhoneModel(phoneData);
           String answer2client = calculateDeliveryDistance(deliveryDistance);

           System.out.println(answerYearType);
           System.out.println(recommendation);
           System.out.println(answer2client);
    }
}





