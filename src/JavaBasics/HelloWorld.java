package JavaBasics;

public class HelloWorld {
	
	String name = "Shaleen";
	int age = 10;
	

	public void printName() {
		System.out.println("The name and age of person is " + name +" "+ age);
	}
	
	public static void main(String args[]) {
		System.out.println("Hello World");
		HelloWorld h1 = new HelloWorld();
		HelloWorld h2 = new HelloWorld();
		h1.printName();
	}
}
