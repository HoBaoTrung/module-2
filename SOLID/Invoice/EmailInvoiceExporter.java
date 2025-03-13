package SOLID.Invoice;

import SOLID.Order;

public class EmailInvoiceExporter implements InvoiceExporter {
    @Override
    public void export(Order order) {
        System.out.println("Invoice exported as EMAIL for order total: $" + order.calculateTotal());
    }
}
