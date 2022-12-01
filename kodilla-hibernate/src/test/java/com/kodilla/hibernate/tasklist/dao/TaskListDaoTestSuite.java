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
      TaskList taskList = new TaskList("Lista1", "description1");
      taskListDao.save(taskList);


      //When
      List<TaskList> result = taskListDao.findByListName("Lista1");


      //Then
      assertEquals(1, result.size());

   }



}
