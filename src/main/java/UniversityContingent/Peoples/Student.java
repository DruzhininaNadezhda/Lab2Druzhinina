package UniversityContingent.Peoples;

import java.util.Arrays;



public class Student extends Person {


    public Student(String name, String surname, Gender gender, String facultyStudent, course course, levelEducation levelEducation) {
        super(name, surname, gender, facultyStudent);
        Student.course = course;
        Student.levelEducation = levelEducation;
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
    static course course;

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
    static levelEducation levelEducation;
    @Override
    public String toString() {
        return super.toString() +" studies at " + getDepartment() + ". "  + super.gender.getGender() + " " + course.getCourseN() +"‘th year " + levelEducation.getLevelEducation() + " student.";
    }
    public static void addStudent(Student student) {
        if (students == null || students.length == 0) {
            students = new Student[]{student};
        } else {
            Student[] temp = new Student [students.length + 1];
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            temp[students.length] = student;
            students = temp;
        }
    }
    public static Student[] getStudents () {
        return students;
    }

    public static void main(String[] args) {
        printAll(students);
    }


}
