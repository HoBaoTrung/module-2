package SOLID;

import SOLID.Invoice.EmailInvoiceExporter;
import SOLID.Invoice.InvoiceExporter;
import SOLID.Invoice.PdfInvoiceExporter;
import SOLID.Payment.CreditCardPayment;
import SOLID.Payment.MomoPayment;
import SOLID.Payment.PaymentMethod;

public class App {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(100);
        order.addItem(50);

        PaymentMethod payment = new CreditCardPayment(); // có thể thay đổi
        InvoiceExporter exporter = new PdfInvoiceExporter(); // có thể thay đổi

        OrderProcessor processor = new OrderProcessor(payment, exporter);
        processor.process(order);

        // Tạo đơn hàng
        Order order2 = new Order();
        order2.addItem(200);
        order2.addItem(99.99);

        // Chọn phương thức thanh toán và xuất hóa đơn
        PaymentMethod payment_Momo = new MomoPayment(); // Thay bằng CreditCardPayment, PayPalPayment, v.v.
        InvoiceExporter exporter_Email = new EmailInvoiceExporter(); // Hoặc PdfInvoiceExporter

        // Xử lý đơn hàng
        OrderProcessor processor2 = new OrderProcessor(payment_Momo, exporter_Email);
        processor2.process(order2);

        System.out.println("🎉 Đơn hàng đã được xử lý thành công!");
    }
}
