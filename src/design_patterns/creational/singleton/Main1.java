package design_patterns.creational.singleton;

import design_patterns.creational.singleton.singletons.SingletonSimple;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Calling Simple Singleton (THREAD UNSAFE)");
		SingletonSimple	singleton = SingletonSimple.getInstance("CREATED INSTANCE");
		SingletonSimple singleton2 = SingletonSimple.getInstance("SECOND INSTANCE2");
		
		System.out.println(singleton.value + " 1st");
		System.out.println(singleton2.value + " 2nd");
		
		
	}

}
