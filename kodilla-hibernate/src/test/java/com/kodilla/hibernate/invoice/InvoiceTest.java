package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@Transactional
@SpringBootTest
class InvoiceTest {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {

        // GIVEN
        Product iron = new Product("Żelazko");
        Product vacuum = new Product("Odkurzacz");

        Item item1 = new Item(new BigDecimal(50), 5, new BigDecimal(250));
        Item item2 = new Item(new BigDecimal(10), 5, new BigDecimal(50));

        Invoice invoice = new Invoice("7");

        item1.setProduct(iron);
        item2.setProduct(vacuum);
        iron.getItems().add(item1);
        vacuum.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);


        // WHEN
        productDao.save(iron);
        productDao.save(vacuum);

        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);

        int id = invoice.getId();
        // zrobić asercje sprawdzające, czy wszystkie obiekty mają id.

        // THEN
        assertEquals(2, invoice.getItems().size());
        assertEquals(7, Integer.parseInt(invoice.getNumber()));
        assertNotEquals(0, invoice.getId());


        // CleanUp
        invoiceDao.deleteById(invoice.getId());


    }


}
