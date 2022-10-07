package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("pending task");
        board.getInProgressList().getTasks().add("in progress task");
        board.getDoneList().getTasks().add("completed task");

        //Then
        assertEquals("pending task", board.getToDoList().getTasks().get(0));
        assertEquals("in progress task", board.getInProgressList().getTasks().get(0));
        assertEquals("completed task", board.getDoneList().getTasks().get(0));
    }
}