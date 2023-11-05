package UniversityContingent;
import UniversityContingent.Peoples.*;


import static UniversityContingent.Peoples.Person.Gender.Man;
import static UniversityContingent.Peoples.Person.Gender.Woman;
import static UniversityContingent.Peoples.Person.printAll;

public class Contingent {




    public static void main(String[] args) {

        Professor professor = new Professor("Ronald", "Turner", Person.Gender.Man, "Computer science", "Programming paradigms", Professor.academicDegree.PhD );
        Professor professor1 = new Professor("Ruth", "Hollings", Person.Gender.Woman, "Jurisprudence", "Domestic arbitration", Professor.academicDegree.MSc );
        Aspirant aspirant = new Aspirant("Ronald","Correa", Man, "Computer science", "Design of a functional programming language" );
        Student student = new Student("Leo", "Wilkinson", Man, "Computer science", Student.course.course3, Student.levelEducation.Bakalavr );
        Student student1 = new Student("Anna", "Cunningham", Woman, "World economy", Student.course.course1, Student.levelEducation.Bakalavr);
        Student student2 = new Student ("Jill", "Lundqvist", Woman, "Jurisprudence", Student.course.course1, Student.levelEducation.Master);
        Person[] persons = new Person[]{professor, professor1, aspirant, student, student1,student2};
        Professor.addProfessor(professor);
        Professor.addProfessor(professor1);
        Student.addStudent(student);
        Student.addStudent(student1);
        Student.addStudent(student2);
        Aspirant.addAspirant(aspirant);
        printAll(persons);
    }

    }

