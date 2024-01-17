public class Man extends Student {
    public Man (String firstName, String lastName, int age, int semester) {
        super(firstName, lastName, age, semester);
    }
    public String getNotRequiredSubject() {
        if (getSemester() == 1 || getSemester() == 2) {
            return "Wrestling";
        } else if (getSemester() == 3 || getSemester() == 4) {
            return "Boxing";
        } else {
            return "No subject";
        }
    }
}