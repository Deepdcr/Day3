import java.util.ArrayList;
import java.util.LinkedList;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c1 = new Contact(9926472857l,"Deep");
		LinkedList<Contact> cnt = new LinkedList<Contact>();
	
		cnt.add(new Contact(7746077249l,"Tiara"));
		cnt.add(c1);
		cnt.add(new Contact(9926492614l,"k l l"));
		
		for(int i=0;i<cnt.size();i++)
		{
			System.out.println("contact is : "+cnt.get(i));
		}
	}

}
class Contact
{
	long mobileNumber;
	String contactName;
	
	public Contact(long mobileNumber, String contactName) {
		super();
		this.mobileNumber = mobileNumber;
		this.contactName = contactName;
	}

	@Override
	public String toString() {
		return "contact [mobileNumber=" + mobileNumber + ", contactName=" + contactName + "]";
	}
	
	
}