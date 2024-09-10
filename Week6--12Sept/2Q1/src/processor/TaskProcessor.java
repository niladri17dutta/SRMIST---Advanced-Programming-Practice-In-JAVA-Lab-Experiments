package processor;

import java.util.List;
import task.Task;

public class TaskProcessor {
    private final List<Task> tasks;

    public TaskProcessor(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void processTasks() {
        for (Task task : tasks) {
            task.execute();
        }
    }

    public static void main(String[] args) {
        // Create some tasks
        Task task1 = (Task) new task.SquaringTask(4);
        Task task2 = (Task) new task.SquaringTask(7);
        Task task3 = (Task) new task.SquaringTask(10);

        // Add tasks to the list
        List<Task> taskList = List.of(task1, task2, task3);

        // Process the tasks
        TaskProcessor processor = new TaskProcessor(taskList);
        processor.processTasks();
    }
}
