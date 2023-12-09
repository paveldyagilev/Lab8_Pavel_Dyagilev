public class Teacher extends People {
    Teacher(String nameP, String lastnameP, int ageP) {
        super(nameP, lastnameP, ageP);
    }

    @Override
    void voice() {
        System.out.println("Преподаватель " + name + " объясняет предмет студентам.");
    }

    void teach() {
        System.out.println("Преподаватель " + name + " ведет лекцию");
    }
}
