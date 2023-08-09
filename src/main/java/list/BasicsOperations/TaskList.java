package main.java.list.BasicsOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    //attribute
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }
    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }
    public int getAllNumberOfTasks(){
        return taskList.size();
    }
    public void getDescriptionOfTasks(){
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("Number of tasks: " + taskList.getAllNumberOfTasks());

        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 2");
        System.out.println("Number of tasks: " + taskList.getAllNumberOfTasks());

        taskList.removeTask("Task 2");
        System.out.println("Number of tasks: " + taskList.getAllNumberOfTasks());

        taskList.getDescriptionOfTasks();
    }
}