public class Baseball extends Sports {

    @Override
    void createRules() {
        System.out.println("Applying Baseball rules~");
    }

    @Override
    void preparePlayers() {
        System.out.println("Entry can be 25 players in the list");
        System.out.println("Each team has 9 players in the baseball stadium");
    }

    @Override
    void makePositions() {
        System.out.println("You have to give a position to the player.");
        System.out.println("------------------------------------------");
        System.out.println("└Pitcher and Catcher\n" +
                "└First base\n" +
                "└Second base\n" +
                "└Third base\n" +
                "└Shortstop\n" +
                "└Left field\n" +
                "└Right field\n" +
                "└Center field");
    }
}
