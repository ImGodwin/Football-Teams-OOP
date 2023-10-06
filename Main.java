import entities.Fan;
import entities.Mood;
import entities.Player;
import entities.Team;

public class Main {
    public static void main(String[] args) {
        Player[] p = new Player[11];
        for(int i = 0; i < 11; i++){
            p[i] = new Player("Angelo", "Umberto", 1.88, 21, "Afghanistan", "Napoli", 1000);
        }

        int num = 11;
        Fan[] fan = new Fan[30];
        for(int j=0; j<fan.length; j++){
            fan[j] = new Fan("Alaa", "Mike", 1.70, 33, Mood.Sad, 32, "gridatore");
        }
        Team a = new Team("Napoli", 1885, "Napoli", "Boo", p, fan);

        p[4].introduce();
        fan[4].introduce();
        Team.calcSalary(a);
        p[5].passTheBall(p[10]);
        fan[9].printMood();
    }
}
