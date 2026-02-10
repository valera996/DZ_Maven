package DZ12.Task6;

import java.util.*;
import java.util.stream.Collectors;

public class TaskService<T extends Number> {
    private Set<Task> tasksSet = new HashSet<>();

    public Set<Task> getAll(){
        return Set.copyOf(tasksSet);
    }


    //Метод для добавления новой задачи в список.
    public void addTask(Task task){
        tasksSet.add(task);
    }

    //Метод для удаления задачи по ID.
    public synchronized void removeTask(T id){
        tasksSet.removeIf(n -> n.getId().equals(id));
    }

    //Методы для фильтрации задач по статусу.
    public List<Task> filterTaskByStatus(String status){
        return tasksSet.stream()
                .filter(n -> n.getStatus().equals(status))
                .collect(Collectors.toList());
    }


    //Методы для фильтрации задач по приоритету.
    public List<Task> filterTaskByPriority(String priority){
        return tasksSet.stream()
                .filter(n -> n.getPriority().equals(priority))
                .collect(Collectors.toList());
    }


    //Методы для сортировки задач по дате.
    public LinkedList<Task> sortTaskByDate(){
        return tasksSet.stream()
                .sorted(Comparator.comparing(task -> task.getDate()))
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
    }




}
