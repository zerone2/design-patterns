public class PlaySports {
    public static void main(String[] args){
        Soccer soccer = new Soccer();
        Baseball baseball = new Baseball();
        Basketball basketball = new Basketball();

        System.out.println("\nPreparing Soccer...");
        soccer.playGame();

        System.out.println("\nPreparing Baseball...");
        baseball.playGame();

        System.out.println("\nPreparing Basketball...");
        basketball.playGame();
    }
}
