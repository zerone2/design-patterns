package Factory;
import Manager.*;
import Stadium.*;
import Team.*;

public class BayernMonachiumFactory implements FootballClubFactory {
	public Stadium createStadium() {
		return new BayernMonachiumStadium();
	}
	public Manager createManager() {
		return new BayernMonachiumManager();
	}
	public Team createTeam() {
		return new BayernMonachiumTeam();
	}
}
