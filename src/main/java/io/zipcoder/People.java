package io.zipcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class People<E extends Person> implements Iterable<E> {

    private List<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E p : personList) {
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

    public abstract E[] toArray();

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
