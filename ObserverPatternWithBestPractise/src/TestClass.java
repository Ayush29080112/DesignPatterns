import com.ayush.design.pattern.Observer;
import com.ayush.design.pattern.impl.ConcreteObserver;
import com.ayush.design.pattern.impl.ConcreteSubject;

public class TestClass {
	
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject(0,0,0);
		Observer observer = new ConcreteObserver(s);
		Observer observer2 = new ConcreteObserver(s);
		Observer observer3 = new ConcreteObserver(s);
		Observer observer4 = new ConcreteObserver(s);
		
		s.setHumidity(1);
		s.setPressure(30);
		s.setTemp(20);
	}
	

}
