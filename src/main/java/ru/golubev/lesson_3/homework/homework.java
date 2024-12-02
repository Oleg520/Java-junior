package ru.golubev.lesson_3.homework;

import java.io.*;

public class homework {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        // Добавление
        Person person = new Person("Bob", 30);
        personService.addPerson(person);
        // Обновление
        personService.updatePerson(person.getId(), "Robert", 31);
        // Удаление
        personService.deletePerson(person.getId());
        personService.close();
    }

    public static void serializePerson(Person person, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person deserializePerson(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
