public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment1 = service.calculate(1, 1_000_000, 9.99);
        System.out.println(payment1);

        int payment2 = service.calculate(2, 1_000_000, 9.99);
        System.out.println(payment2);

        int payment3 = service.calculate(3, 1_000_000, 9.99);
        System.out.println(payment3);

    }
}
