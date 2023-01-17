public class Main {
    public static void main(String[] args) {

        int x = 500; //Сумма на счете
        int y = 2000; //Сумма пополнения
        int b = 100; //Бонус 1 руб.

        int bonus;
        if (y > 1000) {
            bonus = y / b;
        } else {
            bonus = 0;
        }
        // int bonus = (y > 1000) ? y / b : 0;

        int finalScore = bonus + x + y;
        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Всего на счету: " + finalScore);


        // Объявляете переменные для входных данных и
        // параметров программы: начально amount го счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}