package com.kodilla.hibernate.task.dao;

import org.springframework.boot.test.context.SpringBootTest;
import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {

   private TaskDao taskDao;
   private static final String DESCRIPTION = "Test: Learn Hibernate";

   @Test
   void testTaskDaoFindByDuration() {
      //Given
      Task task = new Task(DESCRIPTION, 7);
      taskDao.save(task);
      int duration = task.getDuration();

      //When
      List<Task> readTasks = taskDao.findByDuration(duration);

      //Then
      assertEquals(1, readTasks.size());

      //CleanUp
      //int id = readTasks.get(0).getId();
      //taskDao.deleteById(id);
   }
}
