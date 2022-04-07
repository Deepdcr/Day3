
public class Greeting {

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		System.out.println("This is awesome way to develop java coding...");
		clap();
		String calibri;
		String Italic;
		setFont(50,calibri,Italic);
		}
	static void clap()
	{
		System.out.println("clapping....");
	
	}
	static void setFont(int size, String fontName, String fontStyle)
	{
		System.out.println("setting the font size "+size);
		System.out.println("setting the font Name "+fontName);
		System.out.println("setting the font sTYLE "+fontStyle);
	}
}
