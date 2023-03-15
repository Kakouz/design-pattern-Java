package design_patterns.creational.singleton.singletons;

public final class SingletonSimple {
	private static SingletonSimple instance;
	public String value;
	
	private SingletonSimple(String value) {
		this.value = value;
	}
	
	public static SingletonSimple getInstance(String value) {
		if(instance == null) {
			instance = new SingletonSimple(value);
		}
		return instance;
	}
}
