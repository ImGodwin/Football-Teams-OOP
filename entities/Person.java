package entities;

public abstract class Person {
    protected String name;
    protected String surname;
    protected double height;
    protected int age;


    public Person(String name, String surname, double height, int age) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.age = age;
    }

    public abstract void introduce();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
