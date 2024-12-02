package ru.golubev.lesson_3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main1 {
    public static void main(String[] args) throws Exception {
        String str = "Это строка";
        FileOutputStream fileOutputStream = new FileOutputStream("ser.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(str);
        objectOutputStream.close();

    }
}
