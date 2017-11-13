package LOLCharacter;

public class AdCarryCaitlynCharacter extends LOLCharacter {
    public AdCarryCaitlynCharacter(){
        name = "Caitlyn";
        speech = "Boom head shot!!";

        skills.add("Q : Piltover Peacemaker");
        skills.add("W : Yordle Snap Trap");
        skills.add("E : 90 Caliber Net");
        skills.add("R : Ace in the hole");
    }

    @Override
    public void dance() { System.out.println("dance with the gun"); }
    public void talk() { System.out.println(speech); }
}
