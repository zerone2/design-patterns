package Observer;

public interface Watcher {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}