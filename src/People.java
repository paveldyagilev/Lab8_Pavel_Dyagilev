public class People extends  Object{
    protected String name; //null
    protected String lastname;
    protected int age; // 0

    People() {
        name = "нет";
        lastname = "нет";
        age = 19;
    }
    People(String nameP, String lastnameP) {
        name = nameP;
        lastname = lastnameP;
        age = 20;
    }
    People(String nameP, String lastnameP, int ageP) {
        name = nameP;
        lastname = lastnameP;
        age = ageP;
    }

    @Override
    public String toString() {
        return "Люди{" +
                "имя='" + name + '\'' +
                ", фамилия='" + lastname + '\'' +
                ", лет=" + age +
                '}';
    }
    void walk() {
        System.out.println(name + " ходит");
    }
    void voice() {
        System.out.println(name + " поёт");
    }
    void run() {
        System.out.println(name + " бежит");
    }
}