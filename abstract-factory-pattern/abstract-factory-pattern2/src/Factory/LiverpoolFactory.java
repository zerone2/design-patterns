package Factory;
import Manager.*;
import Stadium.*;
import Team.*;

public class LiverpoolFactory implements FootballClubFactory {
	public LiverpoolFactory() {
		System.out.println("I love Liverpool");
	}
	public Stadium createStadium() {
		return new LiverpoolStadium();
	}
	public Manager createManager() {
		return new LiverpoolManager();
	}
	public Team createTeam() {
		return new LiverpoolTeam();
	}
}
