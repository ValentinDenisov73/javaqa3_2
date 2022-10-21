public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 1100;
        int total;
        int bonus = 0;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
            total = account + replenishment + bonus;
        } else {
            total = account + replenishment;
        }
        System.out.println("Итоговый счет: " + total);
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}