public class Woman extends Student {
    public Woman (String firstName, String lastName, int age, int semester) {
        super(firstName, lastName, age, semester);
    }

    public String getNotRequiredSubject() {
        if (getSemester() == 1 || getSemester() == 2, getSemester() == 3, getSemester() == 4, getSemester() == 5){
            return "Dancing";
        } else {
            return "No subject";
        }
    }
    public void changeLastName (String newLastName) {
    setLastName(newLastName)
    }
}