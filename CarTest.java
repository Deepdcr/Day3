
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String arg[]) 
	{
		System.out.println("begin main....");
		
		System.out.println("trying to create spring's container....");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("MySpring2.xml");
		
		System.out.println("Spring container created.....");
	/*	Piston pist = new Piston("Twin Spark");
		Engine engine = new Engine(pist);
		Car mycar = new Car(engine); 
		mycar.startTheCar();
		mycar.stopTheCar();*/
		Car mycar1 = (Car) ctx.getBean("a");
		
		System.out.println("---------------------");
		Car mycar2 = (Car) ctx.getBean("a");
		
		System.out.println("---------------------");
		Car mycar3 = (Car) ctx.getBean("a");
		
		
		System.out.println("end main....");
		
		}
	}

