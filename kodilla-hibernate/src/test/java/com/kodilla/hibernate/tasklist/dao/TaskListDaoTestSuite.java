package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListDaoTestSuite {

   @Autowired
   private TaskListDao taskListDao;


   // Test ma sprawdzić, czy metoda testFindByListName() działa poprawnie.
   @Test
   void testFindByListName() {

      //Given
      Task task = new Task("GYM", 1);
      Task task2 = new Task("RUN", 2);
      Task task3 = new Task("JOGA", 3);
      Task task4 = new Task("RACE", 4);


       TaskList taskList = new TaskList();
      final List<Task> tasks = taskList.getTasks();



      // stworzyc relacjie
               // na tasklistdao zrobic save
               // przy pomocy findby name.



      //When
      List<TaskList> lista = taskListDao.findByListName("GYM");
      taskListDao.save();



      //Then
      // TaskList taskList = lista.get(0);
      System.out.println(taskList);

   }



}
