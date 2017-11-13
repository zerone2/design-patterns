import LOLCharacter.*;

public class StartLOL {
    public static void main(String[] args){
        LOLPlay adcarryLOLPlay = new AdCarryLOLPlay();

        LOLCharacter Character = adcarryLOLPlay.playCharacter("twitch");
        System.out.println("Player picked " + Character.getName() + "\n");
        Character.toString();

        Character = adcarryLOLPlay.playCharacter("caitlyn");
        System.out.println("Player picked " + Character.getName() + "\n");

        Character = adcarryLOLPlay.playCharacter("quinn");
        System.out.println("Player picked " + Character.getName() +"\n");
    }
}
