import java.util.Scanner;
/*Создать задачу
Удалить задачу
Посмотреть все задачи
Выход*/
public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        int action;
        do{
            System.out.println("Меню: ");
            System.out.println("1. Создать задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Посмотреть все задачи");
            System.out.println("4. Выход");
            System.out.println("Выберите действие: ");
            action = sc.nextInt();
            } while (action != 4);




    }
}