public class Association
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		I i1 = new I();
		i1.watchingMovie("MOVIE");
		Restaurant r = i1.lookingForRestaurant();
		FoodRestaurant fd = r.offeringFood();
		KFC kfc = fd.foodRestaurantOfferingFood();
		kfc.kfcFoodRestaurantOfferingFood();
		System.out.println(kfc);
		i1.feelingNostalgia("my fav guitar","my school classroom","library");
		i1.reminder();
		

	}
}
	class Company 
	{
		void MdCalling()
		{
			System.out.println("company MD called for meeting....");
			System.out.println("feeling like my work from home days gonna end soon");
		}
	}
	
	interface watchingMovie
	{
		void watchingMovie(String x);
	}

	class I implements watchingMovie
	{
		public String guitar;
		private String classRoom;
		protected String library;
		
		TwoWheeler tw = new TwoWheeler();
		GasBill gb = new GasBill();
		Hotel bh = new Hotel();
		Toy bt = new Toy();
		
	

	public void watchingMovie(String x)
		{
			System.out.println("I was watching movie..." +x);
			Company compObj = new Company();
			compObj.MdCalling();
			System.out.println("Thanks for the AC inside stopped me from melting, it's so hot outside");
		}
		

		Restaurant lookingForRestaurant()
		{
			System.out.println("looking restaurant for meeting");
			Restaurant r = new Restaurant();
			return r;

		}

		void feelingNostalgia(String guitar, String classRoom, String library)
		{
			System.out.println("good old days with "+guitar+" "+classRoom+" and "+library);
		}

		void reminder()
		{
			System.out.println("REMINDER.....");
			System.out.println("pay GasBill" +gb);
			System.out.println("Book Hotel " +bh);
			System.out.println("Buy Toy " +bt);
		}

		@Override
		public String toString() {
			return "I [guitar=" + guitar + ", classRoom=" + classRoom + ", library=" + library + ", v=" + v + ", tw="
					+ tw + ", gb=" + gb + ", bh=" + bh + ", bt=" + bt + ", toString()=" + super.toString() + "]";
		}

		
		

	}

	class AirConditioner
	{

		@Override
		public String toString() {
			return "AirConditioner []";
		}

	}
	class Aquarium 
	{

		@Override
		public String toString() {
			return "Aquarium []";
		}

		
		}


	class Restaurant
	{
		FoodRestaurant offeringFood() 
		{
			FoodRestaurant fd = new FoodRestaurant();
			return fd;
		}
		void offeringFood(Food f) 
		{
			
		}
	}

	class FoodRestaurant extends Restaurant
	{
		KFC foodRestaurantOfferingFood()
		{
			KFC kfc = new KFC();
			return kfc;
		}
	}

	class KFC extends FoodRestaurant
	{
		AirConditioner ac = new AirConditioner();
		Aquarium aq = new Aquarium();

		void kfcFoodRestaurantOfferingFood()
		{
			System.out.println("provide food with comfort of cooling " + ac + " and " + aq);
		}

		@Override
		public String toString() {
			return "KFC [ac=" + ac + ", aq=" + aq + "]";
		}

	}

	class Food 
	{

	}

abstract class Vehicle
	{
		abstract void parkingVehicle(Vehicle v);
	
			
		Vehicle()
		{
			
		}
		
	}

class TwoWheeler extends Vehicle
	{
		TwoWheeler(){}

		@Override
		void parkingVehicle(Vehicle v) {
			// TODO Auto-generated method stub
			
		}
	}

	
	

	class Hotel
	{

		@Override
		public String toString() {
			return "Hotel []";
		}
		
	}

	class Toy
	{

		@Override
		public String toString() {
			return "Toy []";
		}
		
	}

	class GasBill
	{

		@Override
		public String toString() {
			return "GasBill []";
		}
		
	}