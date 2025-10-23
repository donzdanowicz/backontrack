package com.backontrack.hibernate.tasklist.dao;

import com.backontrack.hibernate.tasklist.Tasklist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TasklistDao extends CrudRepository<Tasklist, Integer> {
    List<Tasklist> findByListName(String listName);
}
