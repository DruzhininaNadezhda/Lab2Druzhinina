package university_contingent.peoples;


import java.util.Collection;
import java.util.List;

public abstract class Person {
    private String name;
    private String surname;
    private String department;
    Gender gender;
    public Person(String name, String surname, Gender gender, String department) {
        this.name = name;
        this.surname = surname;
        this.department =department;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
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
    public static void printAll(Collection<? extends Person> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
    @Override
    public String toString() {
        return "This is " + getSurname() + " " + getName() + ". " + gender.getGender();
    }


    }






