package ru.golubev.lesson_2.lection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> car = Class.forName("lesson_2.lection.Car");
        Constructor<?>[] constructors = car.getConstructors();
        System.out.println(constructors);

        Method [] methods = car.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
    }
}