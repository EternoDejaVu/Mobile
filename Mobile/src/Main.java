public class Main {
    public static void main(String[] args) {
        int payment = 100;

        boolean morethan1000 = true;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100 + payment;
        } else {
            bonus = payment + 0;
        }
        System.out.println("Итоговый бонус:" + bonus);

    }
}