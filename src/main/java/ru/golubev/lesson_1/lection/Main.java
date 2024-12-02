package ru.golubev.lesson_1.lection;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public int action(int x, int y) {
//                return x + y;
//            }
//        };
//
//        PlainInterface plainInterface1 = (x,y) -> Integer.compare(x,y);
//        PlainInterface plainInterface = Integer::compare;
//
//        System.out.println(plainInterface.action(5,6));

//        List<String> list = Arrays.asList("привет", "мир", "я", "родился", "!");
//        list.stream().sorted().filter(str -> str.length()>3).filter(str -> str.contains("т")).forEach(System.out::println);
//        list = list.stream().filter(str -> str.length() > 4).toList();
//        System.out.println(list);

//        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
//        nums.stream().map(x -> "Число: " + x+", квадрат числа: " + (x * x)).forEach(System.out::println);
//        Arrays.asList(5,3,1,0,8,5,87,34,21,1,0).stream().sorted().distinct().forEach(System.out::println);


        List<User> users = Arrays.asList(new User("Леха", 25), new User("Жека", 27), new User("Паша", 33));
        users.stream().map(user -> new User(user.name, user.age-5)).filter(user -> user.age <=25).forEach(System.out::println);
    }
}