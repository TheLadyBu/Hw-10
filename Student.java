public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int semester;

    public Student(String firstName, String lastName, int age, int semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.semester = semester;
    }
    public int getSemester () {
        return semester;
    }
    public void setSemester (int semester) {
        this.semester = semester;
    }
}