import Factory.*;
import Manager.*;
import Stadium.*;
import Team.*;

public class MakeClub {
    private Manager manager;
    private Stadium stadium;
    private Team team;

    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public Stadium getStadium() {
        return stadium;
    }
    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    public void createFootballClub(final FootballClubFactory factory) {
        setManager(factory.createManager());
        setTeam(factory.createTeam());
        setStadium(factory.createStadium());
    }

    public static void main(String[] args) {
        MakeClub makeClub = new MakeClub();
        makeClub.createFootballClub(new LiverpoolFactory());
        System.out.println("Liverpool football club");
        System.out.println("Manager: " + makeClub.getManager().getName());
        System.out.println("His favourite formation: " + makeClub.getManager().getFavouriteformation());
        System.out.println("Stadium limit place: " + makeClub.getStadium().getLimitPlace());
        System.out.println("Squad: "+makeClub.getTeam().getPlayers());
        System.out.println();

        makeClub.createFootballClub(new BayernMonachiumFactory());
        System.out.println("Bayern Monchium football club");
        System.out.println("Manager: " + makeClub.getManager().getName());
        System.out.println("His favourite formation: " + makeClub.getManager().getFavouriteformation());
        System.out.println("Stadium limit place: " + makeClub.getStadium().getLimitPlace());
        System.out.println("Squad: " + makeClub.getTeam().getPlayers());
    }
}
