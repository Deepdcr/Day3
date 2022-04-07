
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kite.showkiteCount();
		Kite k = new Kite("white","aaa",125);
		System.out.println(k);
		Kite k1 = new Kite("orange","bbb",356);
		System.out.println(k1);
		Kite k2 = new Kite("blue","ccc",789);
		System.out.println(k2);
		
		k.showkiteCount();
		k.kiteFight(k2);
		k2.kiteFight(k1);
	}

}
class Kite
{
	private static int kiteCount;
	
	public static void showkiteCount()
	{
		System.out.println("kite count is..."+kiteCount);
	}
	
	private String color;
	private String owner;
	private int length;
	
	public Kite(String color, String owner, int length) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		
		++kiteCount;
		
	}
	public void kiteFight(Kite x)
	{
		System.out.println(owner+" initiated kate fight with "+x.owner);
		for(int i=0;i>10;i++)
		{
			System.out.println("kite fight is going on....");
		}
	}
	

	@Override
	public String toString() {
		return "Kite [kiteCount=" + kiteCount + ", color=" + color + ", owner=" + owner + ", length=" + length + "]";
	}
	
	
	
}