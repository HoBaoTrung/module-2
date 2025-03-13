package SOLID.Payment;

public class MomoPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Momo.");
    }
}
