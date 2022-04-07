
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Tiger t = new Tiger();
    t.roar();
    t.hunt("deer");
    float s = t.run(755, 30);
    System.out.println("Tiger is running with speed "+s+" m/s ");
    int j = t.jump();
    System.out.println("Tiger is jumping "+j+" times ");
	}

}
class Tiger
{
	void roar()
	{
		System.out.println("Tiger is roaring...");
	}
	float run(int distance, int time)
	{
		float speed= (float)distance/time;
		return speed;				
	}
	void hunt(String theHuntAnimal)
	{
		System.out.println("Tiger is hunting..."+theHuntAnimal);
	}
	int jump()
	{
		return 2;
	}
	
}