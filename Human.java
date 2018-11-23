
public class Human {
	String name;
	int personAge;
	String color;
	
	public Human(String name) {
		System.out.println("This person's name is " + name + ".");
	}
	
	public void setAge(int age) {
		personAge = age;
	}
	
	public int getAge() {
		System.out.println("This person is " + personAge + " years old.");
		return personAge;
	}
	
	public void setColor(String tone) {
		color = tone;
	}
	
	public String getColor() {
		System.out.println("This person's nationality is " + color + ".");
		return color;
	}
	public static void main(String []args) {
		Human myself = new Human("Mike");
		
		myself.setAge(32);
		
		myself.getAge();
		
		myself.setColor("white");
		
		myself.getColor();
		
	}
}
