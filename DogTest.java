
public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin mains...");
		
		Dog dogObjRef;
		
		try
		{
			dogObjRef = new Dog(2,"Tuffy");
			System.out.println("dog is "+dogObjRef);
		}
		catch (DogsAgeExceeded e)
		{
			System.out.println("Handler 1 : exception in dogs age "+e);
		}
		catch (DogsAgeNegative e)
		{
			System.out.println("Handler 2 : exception in dogs age "+e);
		}
		catch (DogsNameInvalid e)
		{
			System.out.println("Handler 3 : exception in dogs name "+e);
		}
		System.out.println("End main...");
	}
}	


class DogsAgeExceeded extends Exception
{

	public DogsAgeExceeded(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
}
class DogsAgeNegative extends Exception
{

	public DogsAgeNegative(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
}
class DogsNameInvalid extends Exception
{

	public DogsNameInvalid(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
}
class Dog
{
	int age;
	String name;
	
	public Dog(int age, String name) throws DogsAgeExceeded,DogsAgeNegative, DogsNameInvalid
	{
		super();
		System.out.println("Dog() started...");
		if (age > 20)
		{
			throw new DogsAgeExceeded("Dogs age cananot exceed more than 20");
		}
		else if(age<0)
		{
			throw new DogsAgeNegative("Dogs age cannot be in negative");
		}
		else
		this.age = age;
		
		if(name.matches("[a-zA-Z]+"))
			this.name = name;
		else {
			throw new DogsNameInvalid("Dogs name must be in alphabets");
		}
	
		System.out.println("Dog() finished....");
		
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
}	
	
