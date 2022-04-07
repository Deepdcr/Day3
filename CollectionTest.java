
public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int indScore[] = {100,102,50,60};
		
		int ausScore[] = new int[ 11 ];
		
		ausScore[0] = 100;
		ausScore[2] = 102;
		ausScore[3] = 50;
		ausScore[4] = 60;
		
		for(int i=0;i<indScore.length;i++)
		{
			System.out.println("score :" +indScore[i]);
		}
		System.out.println("-------------");
		try {
		indScore[7] = 99; 
		}
		catch(ArrayIndexOutOfBoundsException e);
		
		for(int i=0;i<ausScore.length;i++)
		{
			System.out.println("score :" +ausScore[i]);
		}
	}

}
