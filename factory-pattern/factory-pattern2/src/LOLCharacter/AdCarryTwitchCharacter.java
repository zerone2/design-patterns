package LOLCharacter;

public class AdCarryTwitchCharacter extends LOLCharacter{
    public AdCarryTwitchCharacter(){
        name = "Twitch";
        speech = "What doesn't kill you just isn't finished yet!!";

        skills.add("Q : Ambush");
        skills.add("W : Venom Cask");
        skills.add("E : Expunge");
        skills.add("R : Spray and Pray");
    }

    @Override
    public void dance() { System.out.println("eat rotten cheese"); }
    public void talk() { System.out.println(speech); }
}
