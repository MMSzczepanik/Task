package SDA;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class ToDoList {
    private Deque<Task> toDoList = new LinkedList<>();

    public void add(Task task){
        task.setDate(LocalDate.now());
        if(task.getPriority()==Priority.HIGH){
            toDoList.addFirst(task);
        }else {
            toDoList.add(task);
        }
    }

    public Task get(){
        Task task = null;
        while(true){
            Period period = Period.between(toDoList.peek().getDeadline(),LocalDate.now());
            task = toDoList.poll();
            if(period.isNegative() || period.isZero()) {
                return task;
            }
        }
    }

    public Task check(){
        return toDoList.peek();
    }

    public List<Task> getAll(){
        List<Task> list = new ArrayList<>();
        for(Task task : toDoList){
            list.add(task);
        }
        return list;
    }

    public void showList(){
        for(Task task : toDoList){
            System.out.println(task);
        }
    }


}
