package ru.golubev.lesson_3;

import java.io.*;

public class Main5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        MyFCs myFCs = new MyFCs("Pitonov", "Piton", "Pitonovich");
//        serialObj(myFCs, "ser.bin");
        MyFCs myFCs = (MyFCs)deSerialObj("ser.bin");
        System.out.println(myFCs);
    }

    static class MyFCs implements Serializable{
        public String lName;
        public String fName;
        public String patronymic;

        public MyFCs(String lName, String fName, String patronymic) {
            this.lName = lName;
            this.fName = fName;
            this.patronymic = patronymic;
        }

        @Override
        public String toString() {
            return String.format("%s %S.%S.",
                    lName, fName.charAt(0), patronymic.charAt(0));
        }
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
