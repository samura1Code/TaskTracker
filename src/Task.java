import java.util.Scanner;
public class Task {
    private String name; //название задачи
    private String description; //описание задачи

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static Task addTask(Scanner sc) {
        System.out.print("Введите название задачи: ");
        String name = sc.nextLine();  // Read the name of the task
        System.out.print("Введите описание задачи: ");
        String description = sc.nextLine();  // Read the description of the task
        return new Task(name, description);
    }

    public void removeTask(String name){
        System.out.println("Remove task");
    }

    public void viewTasks(){
        System.out.println("View task");
    }

}


