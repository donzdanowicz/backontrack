package com.backontrack.hibernate.invoice.dao;

import com.backontrack.hibernate.invoice.Invoice;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {

}
