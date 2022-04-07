
public class AnotherExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person perObj1 = new Person('f', "aaa", 33);
		System.out.println(perObj1);
		
		Train trainObj1 = new Train();
		trainObj1.travel(perObj1);
		
		Destination dest = trainObj1.travel(perObj1,"bhopal", "mp", "india", 460447);

		System.out.println(dest);
	}

}
class Destination
{

	String city;
	String state;
	String country;
	int pin;
	public Destination(String city, String state, String country, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Destination [city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
}

class Train
{

	Destination travel(Person perObj1)
	{
		System.out.println("wow "+perObj1.getName()+" "+perObj1.getGender()+" "+perObj1.getAge()+" is travelling");
		Destination dest = new Destination("bhopal", "mp", "india", 460447);
		return dest;
	}
	
	Destination travel(Person perObj1,String ct, String st, String con, int pin)
	{
		System.out.println("wow "+perObj1.getName()+" "+perObj1.getGender()+" "+perObj1.getAge()+" is travelling");
		Destination dest = new Destination(ct, st, con, pin);
		return dest;
	
	}
	
}
class Person
{
	char gender;
	String name;
	int age;
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	
}