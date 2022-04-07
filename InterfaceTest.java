
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1 = new Person("aaa");
       p1.sleep(22, 7); p1.waking(5);
	}

}
interface Sleeping
{
	void sleep(int whatTime,int howLong);
	
}
interface Waking
{
	void waking(int whatTime);	
}
class Person implements Waking, Sleeping
{
	
    public Person(String personName) {
		super();
		this.personName = personName;
	}

	String personName;
	@Override
	public void sleep(int whatTime,int howLong) {
		// TODO Auto-generated method stub
		System.out.println(personName+" is sleeping at"+whatTime+" for "+howLong+" hours");
	}

	@Override
	public void waking(int whatTime) {
		// TODO Auto-generated method stub
		System.out.println(personName+" waking up at "+whatTime);
	}
	
}
class Laptop implements Waking, Sleeping
{
	
    public Laptop(String modelName) {
		super();
		this.modelName = modelName;
	}

	String modelName;
	@Override
	public void sleep(int whatTime,int howLong) {
		// TODO Auto-generated method stub
		System.out.println(modelName+" is sleeping at"+whatTime+" for "+howLong+" hours");
	}

	@Override
	public void waking(int whatTime) {
		// TODO Auto-generated method stub
		System.out.println(modelName+" waking up at "+whatTime);
	}
	
}