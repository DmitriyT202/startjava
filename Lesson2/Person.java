public class Person {
	
	String gender = "male";
	String name = "Piter";
	double height = 176.5;
	double weight = 74.8;
	int age = 37;
	
	void go() {
		System.out.println(name + " is going");
	}
	
	void sit() {
		System.out.println(name + " is sitting");
	}
	
	void run() {
		System.out.println(name + " is running");
	}
	
	String speak(String phrase) {
		return name + " say: " + phrase;
	}
	
	void learnJava() {
		System.out.println(name + " is learning Java");
	}
}
	