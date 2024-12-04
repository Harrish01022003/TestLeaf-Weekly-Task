package week7.day1;

public class Dog extends Animal{

	String name;
	public Dog(String type,String name) {
		super(type);
		this.name = name;
		System.out.println("Dog Name"+name);
	}
	public static void main(String[] args) {
		Dog obj = new Dog("Rajapalayam","Rajan");
	}

}
