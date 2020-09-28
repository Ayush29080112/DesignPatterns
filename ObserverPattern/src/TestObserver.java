
public class TestObserver {
	
	public static void main(String[] args) {
		Subject temp = new Subject();
		Observer observer = new Observer("Ayush");
		Observer observer2 = new Observer("Vinay");
		Observer observer3 = new Observer("Archana");
		
		temp.register(observer);
		temp.register(observer2);
		temp.register(observer3);
		
		temp.changeSubject(20);
	}
	
	
	
}
