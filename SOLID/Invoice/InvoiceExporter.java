package SOLID.Invoice;

import SOLID.Order;

public interface InvoiceExporter {
    void export(Order order);
}
