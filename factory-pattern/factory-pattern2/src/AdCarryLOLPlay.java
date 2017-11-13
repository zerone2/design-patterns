import LOLCharacter.LOLCharacter;
import LOLCharacter.*;

public class AdCarryLOLPlay extends LOLPlay {
    LOLCharacter createCharacter(String item){
        if(item.equals("quinn")){
            return new AdCarryQuinnCharacter();
        } else if(item.equals("twitch")){
            return new AdCarryTwitchCharacter();
        } else if(item.equals("caitlyn")){
            return new AdCarryCaitlynCharacter();
        } else return null;
    }
}
