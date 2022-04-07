
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		Electricity e = new Electricity();
		m.charging(e);
		call c = m.calling("aman");
		Zoom z1 = c.zoomCall();
		ZoomVideo v = z1.zoomVideoCall();
		ConferenceZoomVideo c1 = v.conferenceZoomVideoCall();
		Picture p1 = m.clickingPicture();	
		
	}

}
class Phone
{
	
}
class Mobile extends Phone //isA
{
	TouchScreen t = new TouchScreen(); //hasA
	
	Memory m = new Memory();
	
	void charging(Electricity e) //usesA
	{
		System.out.println("mobile is charging...");
		
	}
	call calling(String a) 
	{
		call c = new call();
		System.out.println("calling to...."+a);
		return c;
		
	}
	Picture clickingPicture()
	{
		Picture p1 = new Picture();
		System.out.println("clicking picture....");
		return p1;
	}
	
	
	
	
}
class TouchScreen
{
	
}
class Memory
{
	
}
class Charger
{
	
}
class Electricity
{
	
}
class Dial
{
	
}
class call
{
	Zoom zoomCall()
	{
		Zoom z1 = new Zoom();
		return z1;
	}
}
class Zoom
{
	ZoomVideo zoomVideoCall()
	{
		ZoomVideo v = new ZoomVideo();
		return v;
	}
}
class ZoomVideo
{
	ConferenceZoomVideo conferenceZoomVideoCall()
	{
		ConferenceZoomVideo c1 = new ConferenceZoomVideo();
		return c1;
	}
}
class ConferenceZoomVideo
{
	
}
class Picture
{
	
}
