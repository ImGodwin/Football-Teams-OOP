package entities;

public class Fan extends Person{

    private Mood mood;
    private int yearsOfSupport;
    private String role;

    public Fan(String name, String surname, double height, int age, Mood mood, int yearsOfSupport, String role) {
        super(name, surname, height, age);
        this.mood = mood;
        this.yearsOfSupport = yearsOfSupport;
        this.role = role;
    }

    @Override
    public void introduce(){
        System.out.println("Hello my name is " + " " + this.name);
    }
    public void printMood()
    {
     switch (this.mood) {
         case Happy -> System.out.println("We are winning 😂");
         case Sad -> System.out.println("we are losing 😒");
         case Celebrate -> System.out.println("we won 🏆");
         case Depressed -> System.out.println("we lost 🥹");
         case Pissed -> System.out.println("I am pissed 🤬");
     }
     }
}
