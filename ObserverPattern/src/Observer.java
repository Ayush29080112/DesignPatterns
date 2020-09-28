
public class Observer {
	
	private String name;
	private Subject subject;
	
	public void update() {
		System.out.println("You have a new update!!!");
	}
	
	public void registeredSubject(Subject subject) {
		this.subject = subject;
	}

	public Observer(String name) {
		super();
		this.name = name;
	}

	
}
