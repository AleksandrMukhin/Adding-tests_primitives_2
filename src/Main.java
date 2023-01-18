public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int replenishment = 2000;
        int bonus = 100;

        int bonusCalculation;
        if (replenishment > 1000) {
            bonusCalculation = replenishment / bonus;
        } else {
            bonusCalculation = 0;
        }
        // int bonus = (replenishment > 1000) ? replenishment / bonus : 0;

        int finalScore = bonusCalculation + balance + replenishment;
        System.out.println("Начислено бонусов: " + bonusCalculation);
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