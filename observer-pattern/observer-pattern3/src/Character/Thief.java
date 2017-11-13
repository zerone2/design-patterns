package Character;
import Observer.*;

public class Thief implements Character, Observer {

    public Thief(Watcher watcher) {
        watcher.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("적의 출현을 보고 받았고, 그림자 숨기를 시전 할 준비를 합니다.");
        action();
    }


    @Override
    public void action() {
        System.out.println("도적은 그림자 숨기를 시전합니다.");
    }

}