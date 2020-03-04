package io.zipcoder;

import io.zipcoder.Person;
import io.zipcoder.Student;
import io.zipcoder.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student test = new Student(0, "Adam");
        Assert.assertTrue(test instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student test = new Student(0, "Adam");
        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void testLearn() {
        Student test = new Student(0, "Adam");
        test.learn(10);
        Assert.assertEquals(new Double(10.0), test.getTotalStudyTime());
    }

}
