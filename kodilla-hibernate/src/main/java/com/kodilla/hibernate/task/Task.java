package com.kodilla.hibernate.task;



import com.kodilla.hibernate.tasklist.TaskList;
import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TASKS")
public final class Task {

   private int id;
   private String description;
   private Date created;
   private int duration;

   private TaskFinancialDetails taskFinancialDetails;


   private TaskList taskList;
   List<Task> tasks = new ArrayList<>();

   public Task() {
   }

   public Task(String description, int duration) {
      this.description = description;
      this.created = new Date();
      this.duration = duration;
   }

   @Id
   @GeneratedValue
   @NotNull
   @Column(name = "ID", unique = true)
   public int getId() {
      return id;
   }

   @Column(name = "DESCRIPTION")
   public String getDescription() {
      return description;
   }

   @NotNull
   @Column(name="CREATED")
   public Date getCreated() {
      return created;
   }

   @Column(name="DURATION")
   public int getDuration() {
      return duration;
   }

   private void setId(int id) {
      this.id = id;
   }

   private void setDescription(String description) {
      this.description = description;
   }

   private void setCreated(Date created) {
      this.created = created;
   }

   private void setDuration(int duration) {
      this.duration = duration;
   }

   @ManyToOne
   @JoinColumn(name = "tasklist_id")
   public TaskList getTaskList() {
      return taskList;
   }

   public void setTaskList(TaskList taskList) {
      this.taskList = taskList;
   }

   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "TASKS_FINANCIALS_ID")
   public TaskFinancialDetails getTaskFinancialDetails() {
      return taskFinancialDetails;
   }

   public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
      this.taskFinancialDetails = taskFinancialDetails;
   }

   @OneToMany(
           targetEntity = Task.class,
           mappedBy = "taskList",
           cascade = CascadeType.ALL,
           fetch = FetchType.LAZY
   )
   public List<Task> getTasks() {
      return tasks;
   }

   public void setTasks(List<Task> tasks) {
      this.tasks = tasks;
   }
}
