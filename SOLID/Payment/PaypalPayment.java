package SOLID.Payment;

public class PaypalPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Paypal.");
    }
}
