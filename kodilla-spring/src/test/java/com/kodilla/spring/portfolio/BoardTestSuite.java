package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = BoardTestSuite.class)
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "task to do";;
        String taskInProgress = "task in progress";
        String taskDone= "task done";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        assertEquals("task to do" , board.getToDoList().getTasks().get(0));
        assertEquals("task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("task done",board.getDoneList().getTasks().get(0));


    }

}
