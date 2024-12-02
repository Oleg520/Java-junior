package ru.golubev.lesson_1.homework;

import java.util.Arrays;
import java.util.List;

/*
    Напишите программу, которая использует Stream API для обработки списка чисел.
    Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> chisla = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(getSumEvenElements(chisla));
    }

    public static int getSumEvenElements(List<Integer> nums){
//        List<Integer> filtred = nums.stream().filter(n-> n%2==0).toList();
//        int sum = 0;
//        for (int i : filtred){
//            sum += i;
//        }
//        return sum;
        return nums.stream().filter(n-> n%2==0).mapToInt(Integer::intValue).sum();
    }
}
