package UniversityContingent.Peoples;


import UniversityContingent.Contingent;


import static UniversityContingent.Peoples.Person.Gender.Man;
import static UniversityContingent.Peoples.Person.Gender.Woman;
import UniversityContingent.Peoples.*;
public class Person {
    public static void printAll(Object[] objects) {
        if (Professor.getProfessors() != null) {
        for (Professor value : Professor.getProfessors()) {
            System.out.println(value);}
        }
        if (Aspirant.getAspirants() != null) {
        for (Aspirant value : Aspirant.getAspirants()) {
            System.out.println(value);}
        }
        if (Student.getStudents() != null) {
        for (Student value : Student.getStudents()) {
            System.out.println(value);}
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     private String name;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public enum Gender {
        Man("He", "His"),
        Woman("She", "Her");

        private String gender;
        private String gender2;

        public String getGender2() {
            return gender2;
        }

        Gender(String gender, String gender2) {
            this.gender = gender;
            this.gender2 = gender2;
        }

        public String getGender() {
            return gender;
        }


        @Override
        public String toString() {
            return getGender();
        }
    }


    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Person(String name, String surname, Gender gender, String department) {
        this.name = name;
        this.surname = surname;
        this.department =department;
        this.gender = gender;
    }

    Gender gender;
    @Override
    public String toString() {
        return "This is " + getSurname() + " " + getName() + ". " + gender.getGender();
    }


    }






