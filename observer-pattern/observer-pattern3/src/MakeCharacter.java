import Character.Character;
import Character.*;
import Observer.VeteranWatcher;
import Observer.Watcher;

public class MakeCharacter {
    public static void main(String[] args) {
        Watcher watcher = new VeteranWatcher();
        Character paladin = new Paladin(watcher);
        Character warrior = new Warrior(watcher);
        Character priest = new Priest(watcher);
        Character thief = new Thief(watcher);

        watcher.notifyObservers();
    }
}
