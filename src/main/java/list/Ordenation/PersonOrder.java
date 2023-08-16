package main.java.list.Ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonOrder {
    //attributes
    private List<Person> personList;

    public PersonOrder() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        personList.add(new Person(name, age, height));
    }

    public List<Person> orderByAge() {
        List<Person> personByAge = new ArrayList<>(personList);
        Collections.sort(personByAge);
        return personByAge;
    }

    public List<Person> orderByHeight() {
        List<Person> personByHeight = new ArrayList<>(personList);
        Collections.sort(personByHeight, new ComparatorByHeight());
        return personByHeight;
    }

    public static void main(String[] args) {
        PersonOrder personOrder = new PersonOrder();
        personOrder.addPerson("John", 30, 1.80);
        personOrder.addPerson("Doe", 20, 1.90);
        personOrder.addPerson("Jane", 31, 1.70);
        personOrder.addPerson("Bob", 40, 1.50);

        System.out.println("\n------------------\n");
        System.out.println(personOrder.personList);
        System.out.println("\n------------------\n");
        System.out.println(personOrder.orderByAge());
        System.out.println("\n------------------\n");
        System.out.println(personOrder.orderByHeight());
    }
}