package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.List;

@SpringBootTest
public class BoardTestSuite {

//    @Autowired
//    Board board;

    @Test
    public void testTaskAdd() {
        // Utwórz też test testTaskAdd(), który doda do każdej z list po jednym zadaniu
        // (wcześniej uzyskując dostęp do beana klasy Board).
        // Test powinien sprawdzać, czy dodane zadania da się odczytać.

        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);


        // When
        final TaskList toDoList = board.getToDoList();
        final List<String> todo = toDoList.getTasks();
        todo.add("New task one in toDoList");
        String resultToDoList = todo.get(0);

        final TaskList inProgressList = board.getToDoList();
        final List<String> progres = inProgressList.getTasks();
        progres.add("New task one in inProgressList");
        String resultProgresList = progres.get(1);

        final TaskList doneList = board.getToDoList();
        final List<String> done = doneList.getTasks();
        done.add("New task one in inDoneList");
        String resultDoneList = done.get(2);



        // Then
        Assertions.assertEquals("New task one in toDoList", resultToDoList);
        Assertions.assertEquals("New task one in inProgressList", resultProgresList);
        Assertions.assertEquals("New task one in inDoneList", resultDoneList);


    }
}
