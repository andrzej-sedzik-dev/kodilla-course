package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {


    // Napisz klasę konfigurującą beany o nazwie BoardConfig,
    // która utworzy trzy różne beany reprezentujące listy zadań
    // i wstrzyknie je do beana klasy Board.


    @Bean
    public Board toDoList() {
        return new Board();
    }

    @Bean
    public Board inProgressList() {
        return new Board();
    }


    @Bean
    public Board doneList() {
        return new Board();
    }





}
