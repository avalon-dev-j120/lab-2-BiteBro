package ru.avalon.java.j20.labs.models;

import java.text.ParseException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Модель представления о стране.
 */
public class Country {
    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }

    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Country) {
            Country country = (Country) obj;
            return code == country.code | name == country.name;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    /**
     * Возвращает экземпляр страны созданный из переданного
     * текста в формате 'Код:Название'.
     *
     * @param text тектс в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка
     *                        имеет неверный формат.
     */
    public static Country valueOf(String text) throws ParseException {
        Pattern regEx = Pattern.compile("^([\uFEFF][A-Z]{2})|^([A-Z]{2})[:]([А-Я][^:].+)");
        Matcher matcher = regEx.matcher(text);

        if (matcher.find()) {
            System.out.println(text);
            return new Country(text.substring(0, 2), text.substring(3));
        }
        System.out.println("Неверный формат полученной строки" + text);
        return new Country(null, null);

        /*
         * TODO(Студент): Реализовать метод valueOf класса Country
         */
    }
}

