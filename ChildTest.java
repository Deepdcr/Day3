
public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather gf = new GrandFather();
	    gf.farming();
	    System.out.println("-------------------");
		
		Father f = new Father();
		f.farming();
		f.banking();
		System.out.println("-------------------");
		
		Child c = new Child();
		c.farming();
		c.banking();
		c.JavaCoding();
		System.out.println("-------------------");
		
	}

}
class GrandFather
{
	GrandFather()
	{
		System.out.println("grandfather cont");
	}
	void farming()
	{
		System.out.println("grandfather is doing farming");
	}
}
class Father extends GrandFather
{
	Father()
	{
		System.out.println("father cont");
	}
	void farming()
	{
		System.out.println("father is doing tractor farming");
	}
	void banking()
	{
		System.out.println("father is doing banking");
	}
}
class Child extends Father
{
	Child()
	{
		System.out.println("child cont");
	}
	void farming()
	{
		System.out.println("child is doing robo farming");
	}
	void banking()
	{
		System.out.println("child is doing internet banking");
	}
	void JavaCoding()
	{
		System.out.println("child is doing java coding");
	}
}
