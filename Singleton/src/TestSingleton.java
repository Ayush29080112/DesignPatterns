import com.ayush.singleton.pattern.SingletonObject;

public class TestSingleton {
	
	public static void main(String[] args) {
		SingletonObject object1 = SingletonObject.getInstance();
		SingletonObject object2 = SingletonObject.getInstance();
		
		System.out.println(object1==object2);
	}

}
