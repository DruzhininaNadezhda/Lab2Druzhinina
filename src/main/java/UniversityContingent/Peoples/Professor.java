package UniversityContingent.Peoples;

public class Professor extends Person{
    public Professor(String name, String surname, Gender gender, String facultyStudent, String specialization,academicDegree academicDegree) {
        super(name, surname, gender, facultyStudent);
        setSpecialization(specialization);
        this.academicDegree = academicDegree;
    }
    private Gender gender;
    private static Professor[] professors;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
        private String specialization;
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
static academicDegree academicDegree;
    @Override
    public String toString(){
        return super.toString() +" teaches at " + getDepartment() + ". "  + super.gender.getGender() +" has " + academicDegree.getDegree() + " degree in " + getSpecialization() + ".";
    }
    public static void addProfessor(Professor professor) {
        if (professors == null || professors.length == 0) {
            professors = new Professor[]{professor};
        } else {
            Professor[] temp = new Professor [professors.length + 1];
            for (int i = 0; i < professors.length; i++) {
                temp[i] = professors[i];
            }
            temp[professors.length] = professor;
            professors = temp;
        }
    }
        public static Professor[] getProfessors () {
            return professors;
        }
    }
