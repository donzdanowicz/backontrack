package com.backontrack.hibernate.tasklist.dao;

import com.backontrack.hibernate.tasklist.Tasklist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
public class TasklistDaoTestSuite {
    @Autowired
    private TasklistDao tasklistDao;

    @Test
    void testFindByListName() {
        //Given
        Tasklist tasklist = new Tasklist("toDo", "Testing");
        tasklistDao.save(tasklist);
        String listName = tasklist.getListName();

        //When
        List<Tasklist> readTasklists = tasklistDao.findByListName(listName);

        //Then
        assertEquals(1, readTasklists.size());

        //CleanUp
        int id = readTasklists.get(0).getId();
        tasklistDao.deleteById(id);
    }
}
