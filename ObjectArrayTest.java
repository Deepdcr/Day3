import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet primeNumbers = new TreeSet();
		System.out.println("adding first prime..");
		primeNumbers.add(2);
		
		System.out.println("adding 2nd prime..");
		primeNumbers.add(3);
		
		System.out.println("adding 3rd prime..");
		primeNumbers.add(5);
		
		System.out.println("adding 4th prime..");
		primeNumbers.add(7);
		
		System.out.println("adding 5th prime..");
		primeNumbers.add(11);
		
		System.out.println("adding 6th prime..");
		primeNumbers.add(13);
		
		System.out.println("adding 7th prime..");
		primeNumbers.add(17);
		
		System.out.println("added all prime..");
		
		Iterator primeIterator = primeNumbers.iterator();
		while(primeIterator.hasNext())
		{
			int x = (int) primeIterator.next();
			System.out.println("prime "+x);
		}
		
		
		
		Employee e1 = new Employee(111,"zzz",2500);
		//ArrayList<Employee> staff = new ArrayList<Employee>();
		
		//LinkedList<Employee> staff = new LinkedList<Employee>();
		
	//	HashSet<Employee> staff = new HashSet<Employee>();
		
		TreeSet<Employee> staff = new TreeSet<Employee>();
		
		System.out.println("tree is created...");
		
		staff.add(new Employee(101,"aaa",5000));
		staff.add(e1);
		staff.add( new Employee(102,"bbb",6000));
		staff.add(new Employee(103,"ccc",7000));
		
		Iterator<Employee> iterator = staff.iterator();
		
		while(iterator.hasNext()) 
		{
			Employee theEmp = iterator.next();
			System.out.println("employee is : "+theEmp);
			
		}
		
	/*	for(int i=0;i<staff.size();i++)
		{
			System.out.println("staff is :" +staff.iterator(i));
		}
		System.out.println("entering 6th employee..."); 
		staff.add(new Employee(106,"fff",10000));
		System.out.println("added the employee....");
		
		for(int i=0;i<staff.size();i++)
		{
			System.out.println("staff is :" +staff.iterator(i));
		} */
	}

}

class Employee implements Comparable<Employee>
{
	int employeeNumber;
	String employeeName;
	float salary;
	
	public Employee(int employeeNumber, String employeeName, float salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", salary=" + salary
				+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		System.out.println("comparing "+employeeNumber+ "with" +o.employeeNumber);
		return Integer.compare(o.employeeNumber, employeeNumber);
	}
	
	
}