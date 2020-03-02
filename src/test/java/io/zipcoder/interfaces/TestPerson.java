package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person test = new Person(0, "Adam");
        Assert.assertTrue(test.getId() == 0);
        Assert.assertTrue(test.getName().equals("Adam"));
    }

    @Test
    public void testSetName() {
        Person test = new Person(0, "Adam");
        test.setName("Bobbie");
        Assert.assertTrue(test.getName().equals("Bobbie"));
    }

}
