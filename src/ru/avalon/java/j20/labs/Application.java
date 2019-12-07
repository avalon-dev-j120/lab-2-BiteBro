package ru.avalon.java.j20.labs;

import ru.avalon.java.j20.labs.tasks.*;


/**
 * Лабораторная работа №2
 * <p>
 * по курсу: "DEV-J20. Программирование на платформе Java.
 * Стандартные пакеты"
 */
public class Application {

    /**
     * Задачи, которые следует выполнить в рамках
     * лабораторной работы.
     */
    private static final Task[] tasks = {
            new Task1(),
            new Task2(),
            new Task3(),
            new Task4(),
            new Task5(),
            new Task6()
    };

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) throws Exception {
        /*
         * Задачи выполняются последовательно. В порядке,
         * определённом массивом tasks.
         *
         * Для удобства выполнения заданий, можно менять их
         * порядок и/или закомментировать любой из элементов
         * массива.
         */

        tasks[0].run();
        tasks[1].run();
        tasks[2].run();

        System.out.println("Task 4: ");
        tasks[3].run();
        System.out.println("**********************************");

        System.out.println("Task 5: ");
        tasks[4].run();
        System.out.println("**********************************");

        System.out.println("Task 6: ");
        tasks[5].run();
        System.out.println("**********************************");
        //for (Task task : tasks) task.run();
    }
}
