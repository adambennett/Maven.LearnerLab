package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class People<E> implements Iterable<E> {

    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public Boolean remove(Person person) {
        return personList.remove(person);
    }

    public Person remove(long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                return personList.remove(i);
            }
        }
        return null;
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] people = new Person[personList.size()];
        int i = 0;
        for (Person p : personList) {
            people[i] = p;
            i++;
        }
        return people;
    }

    public Iterator<E> iterator() {
        Iterator<E> iterationer = new Iterator()
        {
            int current = 0;

            @Override
            public boolean hasNext() {
                return current < personList.size();
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) personList.get(current++);
            }
        };
        return iterationer;
    }
}
