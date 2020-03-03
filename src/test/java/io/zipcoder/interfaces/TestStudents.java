package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        //Students inst = Students.getInstance();
        Student adam = new Student(0, "Adam");
        int expected = 29;
        int actual = Students.getInstance().count();
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(Students.getInstance().contains(adam));
    }

}
