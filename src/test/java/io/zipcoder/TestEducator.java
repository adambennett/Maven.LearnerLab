package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation() {
        Educator kris = Educator.KRIS;
        Assert.assertTrue(kris instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Educator kris = Educator.KRIS;
        //Assert.assertTrue((Teacher)kris instanceof Person);
    }

    @Test
    public void testTeach() {
        Educator kris = Educator.KRIS;
        Student testStud = new Student(1, "Pete");
        double numberOfHours = 10.0;
        kris.teach(testStud, numberOfHours);
        double expected = 10.0;
        double actual = testStud.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void testLecture() {
        Educator kris = Educator.KRIS;
        double numberOfHours = 10.0;
        Learner[] students = new Learner[4];
        students[0] = new Student(1, "Pete");
        students[1] = new Student(2, "Rob");
        students[2] = new Student(3, "Jim");
        students[3] = new Student(4, "Mary");
        kris.lecture(students, numberOfHours);
        double expected = numberOfHours / students.length;
        double actualA = students[0].getTotalStudyTime();
        double actualB = students[1].getTotalStudyTime();
        double actualC = students[2].getTotalStudyTime();
        double actualD = students[3].getTotalStudyTime();
        Assert.assertEquals(expected, actualA, 0.05);
        Assert.assertEquals(expected, actualB, 0.05);
        Assert.assertEquals(expected, actualC, 0.05);
        Assert.assertEquals(expected, actualD, 0.05);
    }

}
