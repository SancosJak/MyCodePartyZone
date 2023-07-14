import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Бот - собеседник");
//         Задача 2
//        Напишите программу — простого бота, который задаёт вам вопросы и использует ваши ответы.
//        В программе должно быть не меньше трёх вопросов.
//        Как минимум один ответ нужно считать и использовать, как число.

        Scanner sc = new Scanner(System.in); // включение Scanner

        System.out.println("Привет!");// приглашение пользователю
        System.out.println("Как тебя зовут?");// приглашение пользователю
        String name = sc.nextLine(); // читаем строку

        System.out.println("Привет, " + name + ". Какое красивое имя!");

        System.out.println("Сколько тебе лет?");// приглашение пользователю
        int age = sc.nextInt(); // читаем число

        System.out.println(age + " - замечательный возраст!");

        System.out.println("А какая у вас в стране средняя продолжительность жизни?");// приглашение пользователю
        int life = sc.nextInt(); // читаем число

        System.out.println("Получается, что тебе примерно осталось " + (life - age) + " лет жизни. Не теряй время попусту!");
    }
}

//      Алгоритм организации ввода данных с клавиатуры:
//        * Шаг 1. import необходимых библиотек в код программы
//        * Шаг 2. Инициализация классов и методов для чтения вводимых данных
//        * Шаг 3. Приглашение пользователю с помощью System.out.println("Введите ...");
//        * Шаг 4. Выбор типа переменной, придумывание ей имени, выбор метода чтения;
//        * Шаг 5. Использование полученных данных с помощью System.out.println("Сообщение о чем то ...").

//       Scanner sc = new Scanner(System.in);