package com.backontrack.hibernate.manytomany.dao;

import com.backontrack.hibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company,Integer> {

}
