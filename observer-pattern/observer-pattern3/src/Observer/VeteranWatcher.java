package Observer;

import java.util.ArrayList;

public class VeteranWatcher implements Watcher {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if(idx > 0) observers.remove(idx);
    }
}