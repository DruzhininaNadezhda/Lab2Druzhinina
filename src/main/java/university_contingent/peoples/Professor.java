package university_contingent.peoples;

public class Professor <E> extends Person{
    private String specialization;
    academicDegree academicDegree;
    public Professor(String name, String surname, Gender gender, String facultyStudent, String specialization,academicDegree academicDegree) {
        super(name, surname, gender, facultyStudent);
        this.specialization = specialization;
        this.academicDegree = academicDegree;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public enum academicDegree {
        Candidate ("Кандидат наук"),
        Doctor ("Доктор наук"),
        PhD ("PhD"),
        MSc ("MSc");
        private String degree;
        academicDegree(String degree) {
            this.degree = degree;
        }
        public String getDegree () {
            return degree;
        }
        @Override
        public String toString() {
            return degree;
        }

    }
    @Override
    public String toString(){
        return super.toString() +" teaches at " + getDepartment() + ". "  + super.gender.getGender() +" has " + academicDegree.getDegree() + " degree in " + getSpecialization() + ".";
    }
    }
