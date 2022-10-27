package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "To accomplish";

    private static final String DESCRIPTION_1 = "Cleaning";
    private static final String DESCRIPTION_2 = "Cleaning";
    private static final String DESCRIPTION_3 = "Cleaning";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList1 = new TaskList(LISTNAME, DESCRIPTION_1);
        TaskList taskList2 = new TaskList(LISTNAME, DESCRIPTION_2);
        TaskList taskList3 = new TaskList(LISTNAME, DESCRIPTION_3);

        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
        taskListDao.save(taskList3);

        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        assertEquals(3, readTaskList.size());

        //CleanUp
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);
        taskListDao.delete(taskList3);
    }
}
