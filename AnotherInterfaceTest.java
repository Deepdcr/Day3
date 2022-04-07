
public class AnotherInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
interface InternalExercise
{
	void doYoga();
	void doMeditation();
}
interface ExternalExercise
{
	void doStreching();
	void doSquats();
}
interface Playing
{
	void playingBadminton();
}
class SportAuditorium
{
	static void playingOnly(Playing pl)
	{
		pl.playingBadminton();
	}
}
class Gym
{

	static void doExternalExcerciseOnly(ExternalExercise oex) {
		// TODO Auto-generated method stub
		oex.doSquats();
		oex.doStreching();
	}

	
}
class SadhanaKendra
{
	static void doInternalExerciseOnly(InternalExercise iex)
	{
		iex.doMeditation();
		iex.doYoga();
	}
}
class SportsPark implements ExternalExercise,Playing
{
	@Override
	public void doStreching() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSquats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playingBadminton() {
		// TODO Auto-generated method stub
		
	}

	}
	

class SocietyPark extends SportsPark
{
  void doWhateverYouWant(SportsPark sp)
  {
	 // sp.doYoga();
	//  sp.doMeditation();
	  sp.doSquats();
	  sp.doStreching();
	  sp.playingBadminton();
  }
}
