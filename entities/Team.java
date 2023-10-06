package entities;

public class Team {
    private String name;
    private int established;
    private String location;
    private String coach;
    private Player[] giocatori;
    private Fan[] fanbase;
    private Jersey jerseys;

    public Team(String name, int established, String location, String coach, Player[] giocatori, Fan[] fanbase) {
        this.name = name;
        this.established = established;
        this.location = location;
        this.coach = coach;
        this.giocatori = giocatori;
        this.fanbase = fanbase;
        this.jerseys = new Jersey();

    }

    public  static  long calcSalary(Team x) {
        long sum = 0;
        for (Player p : x.giocatori) {
            sum += p.getIncome();
        }
        return sum;
    }


}
