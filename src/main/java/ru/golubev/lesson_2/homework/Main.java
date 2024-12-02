package ru.golubev.lesson_2.homework;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> s = Class.forName("java.lang.String");
        Method[] methods = s.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
    }
}
