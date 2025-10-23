package com.backontrack.hibernate.invoice.dao;

import com.backontrack.hibernate.invoice.Invoice;
import com.backontrack.hibernate.invoice.Item;
import com.backontrack.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Book");
        Product product2 = new Product("Pencil");
        Item item = new Item(2, BigDecimal.valueOf(19), product);
        Item item2 = new Item(1, BigDecimal.valueOf(2), product2);
        Invoice invoice = new Invoice("19/2025");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        product.setItem(item);
        product2.setItem(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int productId = product.getId();
        int product2Id = product2.getId();
        int itemId = item.getId();
        int item2Id = item2.getId();


        //Then
        assertNotEquals(0, invoiceId);
        assertNotEquals(0, productId);
        assertNotEquals(0, product2Id);
        assertNotEquals(0, itemId);
        assertNotEquals(0, item2Id);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
        productDao.deleteById(productId);
        productDao.deleteById(product2Id);
        itemDao.deleteById(itemId);
        itemDao.deleteById(item2Id);
    }
}
