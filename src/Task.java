import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Task {
    private String name; //название задачи
    private String description; //описание задачи
    static HashMap<String, String> tasksMap = new HashMap<>(); //карта для хранения задач

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
        tasksMap.put(name, description);
        return new Task(name, description);
    }

    public void removeTask(String name){
        System.out.println("Remove task");
       // tasksMap.remove(name); удалить таску по ключу
    }

    public void viewTasks(){
        if(tasksMap.isEmpty()){
            System.out.println("Список задач пуст");
        }
        else{
            System.out.println("Список задач: ");
            for (Map.Entry<String,String> entry: tasksMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " - " + value);
            }
        }

    }

}


