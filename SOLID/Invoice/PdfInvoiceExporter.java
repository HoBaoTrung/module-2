package SOLID.Invoice;

import SOLID.Order;

public class PdfInvoiceExporter implements InvoiceExporter {
    @Override
    public void export(Order order) {
        System.out.println("Invoice exported as PDF for order total: $" + order.calculateTotal());
    }
}
