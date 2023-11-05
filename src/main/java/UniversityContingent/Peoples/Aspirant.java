package UniversityContingent.Peoples;

import static UniversityContingent.Peoples.Person.Gender.Woman;

public class Aspirant extends Person {
    private static Aspirant[] aspirants;
    public Aspirant(String name, String surname, Person.Gender gender, String facultyStudent, String dissertation) {
        super(name, surname, gender, facultyStudent);
        setDissertation(dissertation);
    }

    public static void main(String[] args) {
        Aspirant aspirant1 = new Aspirant("dsds", "csss", Woman, "fsf", "dfsd");
    }

    public String getDissertation() {
        return dissertation;
    }

    public void setDissertation(String dissertation) {
        this.dissertation = dissertation;
    }

    private String dissertation;

    public String toString() {
        return super.toString() +" is postgraduate  at " + getDepartment() +". " + super.gender.getGender2() +" thesis title is " + getDissertation() +".";
    }
    public static void addAspirant(Aspirant aspirant) {
        if (aspirants == null || aspirants.length == 0) {
            aspirants = new Aspirant[]{aspirant};
        } else {
            Aspirant[] temp = new Aspirant[aspirants.length + 1];
            for (int i = 0; i < aspirants.length; i++) {
                temp[i] = aspirants[i];
            }
            temp[aspirants.length] = aspirant;
            aspirants = temp;
        }
    }
    public static Aspirant[] getAspirants () {
        return aspirants;
    }
}
