package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        ResourceBundle resBundle = read("resources/strings/titles");
        ResourceBundle resBundleEn = read("resources/strings/titles", new Locale("en"));

        System.out.println(new String(resBundle.getString("menu.tools").getBytes("ISO-8859-1"), "UTF-8"));
        System.out.println(new String(resBundle.getString("menu.tools.settings").getBytes("ISO-8859-1"), "UTF-8"));
        System.out.println(new String(resBundle.getString("menu.help.about").getBytes("ISO-8859-1"), "UTF-8"));
        System.out.println(resBundleEn.getString("menu.tools"));
        System.out.println(resBundleEn.getString("menu.tools.settings"));
        System.out.println(resBundleEn.getString("menu.help.about"));

        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         *
         * 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         *
         * 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {
        ResourceBundle resBundle = ResourceBundle.getBundle(path);
        return resBundle;

    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
        ResourceBundle resBundle = ResourceBundle.getBundle(path, locale);
        return resBundle;
    }
}
