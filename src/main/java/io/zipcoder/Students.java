package io.zipcoder;

import java.util.Iterator;

public final class Students extends People<Student> {

    private static Students INSTANCE;

    private Students() { }

    public static Students getInstance() {
        return INSTANCE;
    }

    static {
        try {
            INSTANCE = new Students();
            INSTANCE.add(new Student(0, "Adam"));
            INSTANCE.add(new Student(1, "April"));
            INSTANCE.add(new Student(2, "Chip"));
            INSTANCE.add(new Student(3, "Chris"));
            INSTANCE.add(new Student(4, "James"));
            INSTANCE.add(new Student(5, "Khalil"));
            INSTANCE.add(new Student(6, "Von"));
            INSTANCE.add(new Student(7, "Aarti"));
            INSTANCE.add(new Student(8, "Corey"));
            INSTANCE.add(new Student(9, "David C."));
            INSTANCE.add(new Student(10, "David K."));
            INSTANCE.add(new Student(11, "Destiny"));
            INSTANCE.add(new Student(12, "Emily"));
            INSTANCE.add(new Student(13, "Giles"));
            INSTANCE.add(new Student(14, "Greg"));
            INSTANCE.add(new Student(15, "Han"));
            INSTANCE.add(new Student(16, "Jimmy"));
            INSTANCE.add(new Student(17, "Jeremy"));
            INSTANCE.add(new Student(18, "Kevin"));
            INSTANCE.add(new Student(19, "Leila"));
            INSTANCE.add(new Student(20, "Matt"));
            INSTANCE.add(new Student(21, "Mo"));
            INSTANCE.add(new Student(22, "Moe"));
            INSTANCE.add(new Student(23, "Raheel"));
            INSTANCE.add(new Student(24, "Sandeep"));
            INSTANCE.add(new Student(25, "Sandy"));
            INSTANCE.add(new Student(26, "Ujjwal"));
            INSTANCE.add(new Student(27, "Zanetta"));
            INSTANCE.add(new Student(28, "Zeth"));
        } catch(Exception e) {
            throw new RuntimeException("Exception occured in static initialization of Students instance");
        }
    }

    @Override
    public Student[] toArray() {
        Student[] people = new Student[INSTANCE.count()];
        int i = 0;
        for (Iterator<Student> it = INSTANCE.iterator(); it.hasNext(); ) {
            Student p = it.next();
            people[i] = p;
            i++;
        }
        return people;
    }
}
