import java.util.ArrayList;

public class Team {

    private String name;
    private Participant[] team;
    private ArrayList<Participant> team_passed ;

    public Team(String name, Participant[] team) {
        this.name = name;
        this.team = team;
        this.team_passed = new ArrayList<Participant>();
    }

    public void showInfo() {
        String info = "Участники команды " + this.getName() + ":";
        for (Participant participant : team) {
            info = info + "\n" + participant;
        }
        System.out.println(info);
    }

    public void showResults() {
        for (Participant participant : team_passed) {
            System.out.println(participant.getName() + " полностью прошёл полосу препятствий");
        }

    }

    public String getName() {
        return name;
    }

    public Participant[] getTeam() {
        return team;
    }

    public ArrayList<Participant> getTeam_passed() {
        return team_passed;
    }
}
