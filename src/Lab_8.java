public class Lab_8 {
    public static void main(String[] args) {
        People people = new People("Павел", "Дягилев", 19);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Егор", "Малинин", 30);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Дмитрий", "Дедюкин", 52);
        teacher.voice();
        teacher.teach();
    }
}
