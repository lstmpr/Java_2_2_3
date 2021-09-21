public class CreditPaymentService {
    public int calculate(int year) {
        int month = year * 12;
        double percent = 9.99;
        double mps = percent / 12 / 100;
        //mps - месячная процентная ставка
        double mps2 = Math.pow(1 + mps, month);
        //mps2 - (1+месячная процентная ставка)^(количество платежей)
        double ka = (mps * mps2) / (mps2 - 1);
        // ka - коэффициент аннуитета
        int sum = 1_000_000;
        int payment = (int) (sum * ka);
        return payment;
    }
}
