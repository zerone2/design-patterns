public class Basketball extends Sports {

    @Override
    void createRules() {
        System.out.println("Applying Basketball rules~");
    }

    @Override
    void preparePlayers() {
        System.out.println("5 vs 5 game : Each team has 5 players in the basketball court");
        System.out.println("3 vs 3 game : Each team has 3 players in the basketball court");
    }

    @Override
    void makePositions() {
        System.out.println("You have to give a position to the player.");
        System.out.println("------------------------------------------");
        System.out.println("└Point guard\n" +
                "└Shooting guard\n" +
                "└Small forward\n" +
                "└Power forward\n" +
                "└Center");
    }
}
