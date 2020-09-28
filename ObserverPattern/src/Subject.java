import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private int temp=20;
	private List<Observer> observers = new ArrayList<Observer>();

	public void register(Observer observer) {
		observers.add(observer);
		observer.registeredSubject(this);
	}
	
	public void unRegister(Observer observer) {
		observers.remove(observer);
		observer.registeredSubject(null);
	}
	
	public void notifyObservers() {
		observers.forEach(observer -> observer.update());
	}
	
	public void changeSubject(int temp) {
		this.temp = temp;
		notifyObservers();
	}
}
