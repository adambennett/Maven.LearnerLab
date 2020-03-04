package io.zipcoder;

import java.util.Iterator;

public class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private Instructors() {}

    public static Instructors getInstance() {
        return INSTANCE;
    }

    static {
        try {
            INSTANCE = new Instructors();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in static initialization of Instructors instance");
        }
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] people = new Instructor[INSTANCE.count()];
        int i = 0;
        for (Iterator<Instructor> it = INSTANCE.iterator(); it.hasNext(); ) {
            Instructor p = it.next();
            people[i] = p;
            i++;
        }
        return people;
    }
}
