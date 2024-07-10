import java.util.Scanner;
public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task task = new Task("", "");
        int action;
        do{
            System.out.println("Меню: ");
            System.out.println("1. Создать задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Посмотреть все задачи");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            action = sc.nextInt();

            switch(action){
                case 1 :
                    sc.nextLine();
                    Task newTask = task.addTask(sc);
                    break;
                case 2 :
                    sc.nextLine(); // Очищаем символ новой строки из входного потока
                    System.out.println("Введите имя задачи, которую вы хотите удалить:");
                    String nameToRemove = sc.nextLine();
                    task.removeTask(nameToRemove);
                    break;
                case 3 :
                    task.viewTasks();
                    break;
                case 4 :
                    break;

            }

        } while (action != 4);

    }
}