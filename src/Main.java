public class Main {
    public static void main(String[] args) {
        int os= 0;
        if (os==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 2
        System.out.println("task 2");
        os= 0;
        int clientDeviceYear= 2012;
        if (os==0 && clientDeviceYear <2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
        } else if (os==0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения iOS для по ссылке");
        }
          if (os==1 && clientDeviceYear <2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке».");
        } else if  (os==1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения Android для по ссылке");
        }


          //task 3
        System.out.println("task 3");
          int year =2000;
          if (year> 1584 && (year % 4 ==0 && year % 100 > 0) || year % 400== 0) {
              System.out.println(year +" год является високосным");
          } else {
              System.out.println("год не является високосным");}



          //task 4
        System.out.println("task 4");
          int deliveryDistance=95;
          if (deliveryDistance<= 20) {
              System.out.println("Потребуетс дней:" + 1);
          } else  if (deliveryDistance>20 && deliveryDistance <=60){
              System.out.println("Потребуетс дней:" + 2);
          }else  if (deliveryDistance >60 && deliveryDistance <=100) {
              System.out.println("Потребуетс дней:" + 3);
          } else {
              System.out.println("Доставки нет");}
           //task 5
        System.out.println("task 5");

          int monthNumber = 12;
          switch (monthNumber){
              case 12:
              case 1:
              case 2:
                  System.out.println(" зима");
                  break;
              case 3:
              case 4:
              case 5:
                  System.out.println(" весна");
                  break;
              case 6:
              case 7:
              case 8:
                  System.out.println(" лето");
                  break;
              case 9:
              case 10:
              case 11:
                  System.out.println(" осень");
                  break;
              default:
                  System.out.println(" неверный номер месяца ");


















          }








    }
}