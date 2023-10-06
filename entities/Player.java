package entities;

public class Player extends Person {

    private String nationality;
    private String team;
    private double income;


    public Player(String name, String surname, double height, int age, String nationality) {
        super(name, surname, height, age);
        this.nationality = nationality;
    }


    public Player(String name, String surname, double height, int age, String nationality, String team, double income) {
        this(name, surname, height, age, nationality);
        this.team = team;
        this.income = income;
    }

    public  void passTheBall(Player male)
    {
        System.out.println(this.name + " passed the ball to " + male.name);
    }


    @Override
    public void introduce(){
        System.out.println("Hello my name is " + this.name + "  I come from " + this.nationality + " and i play for " + team);
    }

    public double getIncome() {
        return income;
    }
}
