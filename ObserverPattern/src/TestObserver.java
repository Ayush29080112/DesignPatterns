
public class TestObserver {
	
	public static void main(String[] args) {
		Subject temp = new Subject();
		Observer observer = new Observer("A");
		Observer observer2 = new Observer("V");
		Observer observer3 = new Observer("Ar");
		
		temp.register(observer);
		temp.register(observer2);
		temp.register(observer3);
		
		temp.changeSubject(20);
	}
	
	
	
}
