import java.time.LocalDate;
import java.util.ArrayList;

public class ObjectLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log logObj = new Log("missed",LocalDate.of(2022,3,12),"aaa");
		
		ArrayList<Log> arrLog = new ArrayList<Log>();
		
		arrLog.add(new Log("dialed", LocalDate.of(2022, 3, 13),"bbb"));
		arrLog.add(logObj);
		arrLog.add(new Log("recieved", LocalDate.of(2022, 3, 14),"ccc"));
		
		for(int i=0;i<arrLog.size();i++)
		{
			System.out.println("Log is : "+arrLog.get(i));
		}
			

	}

}
class Log
{
	 String logType;
	 LocalDate logDate;
	 String name;
	public Log(String logType, LocalDate logDate, String name) {
		super();
		this.logType = logType;
		this.logDate = logDate;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logDate=" + logDate + ", name=" + name + "]";
	}

	 
	 
}