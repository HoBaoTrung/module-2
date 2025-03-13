package SOLID;

import SOLID.Invoice.InvoiceExporter;
import SOLID.Payment.PaymentMethod;

public class OrderProcessor {
    private PaymentMethod paymentMethod;
    private InvoiceExporter invoiceExporter;
    public OrderProcessor(PaymentMethod paymentMethod, InvoiceExporter invoiceExporter) {
        this.paymentMethod = paymentMethod;
        this.invoiceExporter = invoiceExporter;
    }

    public void process(Order order) {
        double amount = order.calculateTotal();
        this.paymentMethod.pay(amount);
        this.invoiceExporter.export(order);
    }
}
