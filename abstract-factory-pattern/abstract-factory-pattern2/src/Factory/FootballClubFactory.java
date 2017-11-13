package Factory;
import Manager.*;
import Stadium.*;
import Team.*;

public interface FootballClubFactory {
	public Stadium createStadium();
	public Manager createManager();
	public Team createTeam();
}
