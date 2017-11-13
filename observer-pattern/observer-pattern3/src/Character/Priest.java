package Character;

import Observer.*;

public class Priest implements Character, Observer {

    public Priest(Watcher watcher) {
        watcher.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("적의 출현을 보고 받았고, 축복을 시전 할 준비를 합니다.");
        action();
    }

    @Override
    public void action() {
        System.out.println("성직자는 축복을 시전합니다.");
    }
}