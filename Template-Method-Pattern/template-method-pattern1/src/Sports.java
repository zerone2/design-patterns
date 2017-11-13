public abstract class Sports {
    void playGame(){
        initialize();
        System.out.println("===================================");
        placeBet();
        startGame();
        System.out.println("===================================");
        endGame();
        System.out.println("===================================");
        System.out.println("===================================");
    }

    void initialize(){
        createRules();
        System.out.println("===================================");
        preparePlayers();
        System.out.println("===================================");
        makePositions();
    }
    abstract void createRules();
    abstract void preparePlayers();
    abstract void makePositions();

    void startGame(){
        System.out.println("Game just started");
    }
    void endGame(){
        System.out.println("Game just ended");
    }
    void placeBet(){}

}
