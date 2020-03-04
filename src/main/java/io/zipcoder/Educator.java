package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher {
    KRIS(0, "Kris"),
    NOBLES(1, "Nobles"),
    DOLIO(2, "Dolio"),
    ROBERTO(3, "Roberto"),
    FROILAN(4, "Froilan")
    ;

    private final Instructor instructor;
    private double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
        this.timeWorked = 0.0;
        Instructors.getInstance().add(this.instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
