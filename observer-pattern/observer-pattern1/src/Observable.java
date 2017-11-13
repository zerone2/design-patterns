import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void notifyObserver(Object arg) {
		for(Observer o: observers) {
			o.update(this, arg);
		}
	}
	public void setChanged() {
	}
}
