package university_contingent.peoples;
import university_contingent.peoples.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static university_contingent.peoples.Person.Gender.Man;
import static university_contingent.peoples.Person.Gender.Woman;
import static university_contingent.peoples.Person.printAll;

public class Student extends Person {
    levelEducation levelEducation;
    course course;
    public Student(String name, String surname, Gender gender, String facultyStudent, course course, levelEducation levelEducation) {
        super(name, surname, gender, facultyStudent);
        this.course = course;
        this.levelEducation = levelEducation;
    }
    private static Student [] students;
    public enum course {
        course1 ("I"),
        course2 ("II"),
        course3 ("III"),
        course4 ("IV"),
        course5 ("V");
        private String courseN;

        course(String courseN) {
            this.courseN = courseN;
        }
        public String getCourseN () {
            return courseN;
        }
        @Override
        public String toString() {
            return getCourseN();
        }
    }
    public enum levelEducation {
        Master ("master"),
        Bakalavr("bakalavr"),
        Aspirant("Аспирант");
        private String level;

        levelEducation(String level) {
            this.level = level;
        }
        public String getLevelEducation() {
            return level;
        }
        @Override
        public String toString() {
            return getLevelEducation();
        }
    }
    public static void studentCollection(Collection<? super Student> studentCollection, Student ... student) {
        studentCollection.addAll(Arrays.asList(student));
    }
    @Override
    public String toString() {
        return super.toString() +" studies at " + getDepartment() + ". "  + super.gender.getGender() + " " + course.getCourseN() +"‘th year " + levelEducation.getLevelEducation() + " student.";
    }

}
