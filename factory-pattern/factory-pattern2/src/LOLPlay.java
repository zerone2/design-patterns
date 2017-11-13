import LOLCharacter.*;

public abstract class LOLPlay {
    abstract LOLCharacter createCharacter(String item);

    public LOLCharacter playCharacter(String champ){
        LOLCharacter Champion = createCharacter(champ);
        System.out.println("--- Making " + Champion.getName() + "---");
        Champion.getReady();
        Champion.attack();
        Champion.dance();
        Champion.talk();
        return Champion;
    }
}
