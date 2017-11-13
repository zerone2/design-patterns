package Subject;

import Display.CurrentConditionsDisplay;
import Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
