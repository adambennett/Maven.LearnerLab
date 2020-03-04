package io.zipcoder;

import io.zipcoder.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        int expected = 29;
        int actual = Students.getInstance().count();
        Assert.assertEquals(expected, actual);
    }

}
