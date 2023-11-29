package university_contingent;
import university_contingent.peoples.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static university_contingent.peoples.Person.Gender.Man;
import static university_contingent.peoples.Person.Gender.Woman;
import static university_contingent.peoples.Person.printAll;
import static university_contingent.peoples.Student.studentCollection;

public class Contingent  {
    public static void main(String[] args) {
        Professor professor = new Professor(
                "Ronald",
                "Turner",
                Person.Gender.Man,
                "Computer science",
                "Programming paradigms",
                Professor.academicDegree.PhD );
        Professor <Person> professor1 = new Professor <>("Ruth", "Hollings", Person.Gender.Woman, "Jurisprudence", "Domestic arbitration", Professor.academicDegree.MSc );

        Aspirant aspirant = new Aspirant("Ronald","Correa", Man, "Computer science", "Design of a functional programming language" );

        Student student = new Student("Leo", "Wilkinson", Man, "Computer science", Student.course.course3, Student.levelEducation.Bakalavr );
        Student student1 = new Student("Anna", "Cunningham", Woman, "World economy", Student.course.course1, Student.levelEducation.Bakalavr);
        Student student2 = new Student ("Jill", "Lundqvist", Woman, "Jurisprudence", Student.course.course1, Student.levelEducation.Master);

        //Student[] students = new Student[]{student, student1,student2};
        List <Person> contingent = new ArrayList<>();
        studentCollection(contingent, student, student2, student1);
        contingent.add(professor);
        contingent.add(professor1);
        contingent.add(aspirant);
        printAll(contingent);

        System.out.println("\t");

        Collection <Student> students = new ArrayList<>();
        studentCollection (students, student1);
        students.add(student);
        students.add(student2);
        printAll(students);
        }
    }

