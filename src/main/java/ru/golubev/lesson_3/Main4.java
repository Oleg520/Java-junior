package ru.golubev.lesson_3;

import java.io.*;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String>list = new ArrayList<>();
        list = (ArrayList<String>) deSerialObj("ser.bin");
        System.out.println(list);
    }

    public static void serialObj(Object object, String file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
                objectOutputStream.writeObject(object);
            }
        }
    }

    public static Object deSerialObj(String file) throws IOException, ClassNotFoundException{
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
                return objectInputStream.readObject();
            }
        }
    }
}
