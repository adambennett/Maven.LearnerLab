package io.zipcoder;

import io.zipcoder.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test() {
        int expected = 5;
        int actual = Instructors.getInstance().count();
        Assert.assertEquals(expected, actual);
    }

}
