package SDA;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ToDoList list = new ToDoList();
        list.add(new Task("zadanie1", "glupie zadanie", Priority.LOW, LocalDate.of(2019,01,1)));
        list.add(new Task("zadanie2", "glupie zadanie", Priority.LOW, LocalDate.of(2019,01,27)));
        list.add(new Task("zadanie3", "glupie zadanie", Priority.HIGH, LocalDate.of(2019,01,25)));
        list.add(new Task("zadanie4", "glupie zadanie", Priority.LOW, LocalDate.of(2019,01,30)));
        list.add(new Task("zadanie5", "glupie zadanie", Priority.MEDIUM, LocalDate.of(2019,01,26)));

        list.showList();

        System.out.println();
        System.out.println(list.get());
    }
}
