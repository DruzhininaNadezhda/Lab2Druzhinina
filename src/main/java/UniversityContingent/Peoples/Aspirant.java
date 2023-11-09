package UniversityContingent.Peoples;

import static UniversityContingent.Peoples.Person.Gender.Woman;

public class Aspirant extends Person {
    private String dissertation;
    public Aspirant(String name, String surname, Person.Gender gender, String facultyStudent, String dissertation) {
        super(name, surname, gender, facultyStudent);
        this.dissertation = dissertation;
    }
    public String getDissertation() {
        return dissertation;
    }
    public void setDissertation(String dissertation) {
        this.dissertation = dissertation;
    }
    @Override
    public String toString() {
        return super.toString() +" is postgraduate  at " + getDepartment() +". " + super.gender.getGender2() +" thesis title is " + getDissertation() +".";
    }

}
