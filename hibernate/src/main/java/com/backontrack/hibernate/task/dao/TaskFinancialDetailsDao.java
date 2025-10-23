package com.backontrack.hibernate.task.dao;

import com.backontrack.hibernate.task.TaskFinancialDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {

    List<TaskFinancialDetails> findByPaid(boolean paid);

}
