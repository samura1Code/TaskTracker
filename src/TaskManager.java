import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task task = new Task("", "");

        while (true) {
            System.out.println("Меню: ");
            System.out.println("1. Создать задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Посмотреть все задачи");
            System.out.println("4. Выход");
            System.out.print("Введите номер действия: ");
            String input = sc.nextLine();
            char action = input.charAt(0);

            switch (action) {
                case '1':
                    Task newTask = task.addTask(sc);
                    break;
                case '2':
                    System.out.print("Введите имя задачи, которую вы хотите удалить:");
                    String nameToRemove = sc.nextLine();
                    task.removeTask(nameToRemove);
                    break;
                case '3':
                    task.viewTasks();
                    task.waitForKeyPress(sc);
                    break;
                case '4':
                    System.out.println("Выход из программы...");
                    sc.close();
                    return; // Завершение программы
                default:
                    System.out.println("Такого номера в меню нет!");
                    break;
            }
        }
    }
}