package ru.golubev.lesson_3.homework;

import jakarta.persistence.*;

public class PersonService {
    private EntityManagerFactory emf;

    public PersonService() {
        this.emf = Persistence.createEntityManagerFactory("PersonPU");
    }

    public void addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    public void updatePerson(Long id, String newName, int newAge) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        if (person != null) {
            person.setName(newName);
            person.setAge(newAge);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void deletePerson(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        if (person != null) {
            em.remove(person);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void close() {
        emf.close();
    }
}
