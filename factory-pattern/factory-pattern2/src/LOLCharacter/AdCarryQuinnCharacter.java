package LOLCharacter;

public class AdCarryQuinnCharacter extends LOLCharacter {
    public AdCarryQuinnCharacter(){
        name = "Quinn";
        speech = "attack the enemy's eyes!!";

        skills.add("Q : Blinding Assault");
        skills.add("W : Heightened Senses");
        skills.add("E : Vault");
        skills.add("R : Behind Enemy Lines");
    }

    @Override
    public void dance() { System.out.println("shake back and forward with hands"); }
    public void talk() { System.out.println(speech); }
}
