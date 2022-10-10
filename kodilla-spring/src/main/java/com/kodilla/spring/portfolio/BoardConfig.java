package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.config.Task;

@Configuration
public class BoardConfig {


    // Napisz klasę konfigurującą beany o nazwie BoardConfig,
    // która utworzy trzy różne beany reprezentujące listy zadań
    // i wstrzyknie je do beana klasy Board.

    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;


    @Bean
    Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }


    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }


    @Bean(name = "inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }


    @Bean(name = "doneList")
    public TaskList doneList() {
        return new TaskList();
    }


}
