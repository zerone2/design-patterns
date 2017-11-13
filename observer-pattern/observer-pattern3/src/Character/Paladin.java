package Character;

import Observer.*;

public class Paladin implements Character, Observer {

    public Paladin(Watcher watcher) {
        watcher.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("적의 출현을 보고 받았고, 나갈 준비를 합니다.");
        action();
    }

    @Override
    public void action() {
        System.out.println("성기사는 칼과 방패를 들고 앞으로 나간다.");
    }
}