public class Soccer extends Sports {

    @Override
    void createRules() {
        System.out.println("Applying Soccer rules~");
    }

    @Override
    void preparePlayers() {
        System.out.println("There are 11 players in the soccer field");
    }

    @Override
    void makePositions() {
        System.out.println("You have to give a position to the player.");
        System.out.println("------------------------------------------");
        System.out.println("└Forwards\n" +
                "└Midfielders\n" +
                "└Defenders\n" +
                "└GoalKeeper");
    }

    @Override
    void placeBet() {
        System.out.println("Betting 100$ to my team");
    }
}
