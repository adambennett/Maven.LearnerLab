package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipCodeWilmington {

    private static Students studentsInstance;
    private static Instructors instructorsInstance;
    private static ZipCodeWilmington zcwInstance;

    private ZipCodeWilmington() {}

    public static ZipCodeWilmington getInstance() { return zcwInstance; }

    public static void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(studentsInstance.toArray(), numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours) {
        (instructorsInstance.findById(id)).lecture(studentsInstance.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for (Iterator it = studentsInstance.iterator(); it.hasNext(); ) {
            Student s = (Student) it.next();
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }

    static {
        try {
            zcwInstance = new ZipCodeWilmington();
            studentsInstance = Students.getInstance();
            instructorsInstance = Instructors.getInstance();
        } catch (Exception e) {  throw new RuntimeException("Exception occured in static initialization of ZipCodeWilmington instance"); }
    }

}
