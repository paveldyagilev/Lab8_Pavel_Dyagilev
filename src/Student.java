public class Student extends People {
    Student(String nameP, String lastnameP, int ageP) {
        super(nameP, lastnameP, ageP);
    }
    @Override
    void walk() {
        System.out.println("Студенту " + name + "у" + " не разрешается ходить во время занятий.");
    }

    void learn() {
        System.out.println("Студент " + name + " посещает задания");
    }
}
