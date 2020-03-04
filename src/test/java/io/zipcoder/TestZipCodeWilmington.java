package io.zipcoder;

import io.zipcoder.Instructors;
import io.zipcoder.Student;
import io.zipcoder.Students;
import io.zipcoder.ZipCodeWilmington;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        zcw.hostLecture(0, 10);
        Map<Student, Double> studyMap = zcw.getStudyMap();
        int count = 29;
        for (Map.Entry<Student, Double> entry : studyMap.entrySet()) {
            Assert.assertEquals(20.0/29.0, entry.getValue(), 0.05);
            count--;
        }
        Assert.assertTrue(count==0);
    }

    @Test
    public void testHostLectureWithEducator() {
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Educator kris = Educator.KRIS;
        zcw.hostLecture(kris, 10);
        Map<Student, Double> studyMap = zcw.getStudyMap();
        int count = 29;
        for (Map.Entry<Student, Double> entry : studyMap.entrySet()) {
            Assert.assertEquals(10.0/29.0, entry.getValue(), 0.05);
            count--;
        }
        Assert.assertTrue(count==0);
    }

}
