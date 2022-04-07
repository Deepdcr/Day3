import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class ORMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test
		public void createSamplePassportTest()
		{
		Passport passport = new Passport();
		passport.setPassportId(123456);
		passport.setIssuedBy("Govt. of India");
		passport.setPassportIssueDate(LocalDate.of(2022,6,25));
		passport.setPassportExpiryDate(LocalDate.of(2032,6,25));
		 System.out.println("passport is "+passport);
		
	}
		@Test
		public void createSampleAddressTest()
		{
			Address add1 = new Address();
			add1.setAddressId(1111111);
			add1.setStreet("Dmart Street");
			add1.setArea("Sector 15");
			add1.setCity("Navi Mumbai");
			add1.setState("Maharashtra");
			add1.setCountry("India");
			add1.setPin(400614);
			
			System.out.println("address is "+add1);
		}
		
		@Test
		public void createSampleAddressListTest()
		{
			Address add1 = new Address();
			add1.setAddressId(1111111);
			add1.setStreet("Dmart Street");
			add1.setArea("Sector 15");
			add1.setCity("Navi Mumbai");
			add1.setState("Maharashtra");
			add1.setCountry("India");
			add1.setPin(400614);
			
			System.out.println("address is "+add1);
			
			Address add2 = new Address();
			add2.setAddressId(2222222);
			add2.setStreet("CROMA Street");
			add2.setArea("Sector 15");
			add2.setCity("Navi Mumbai");
			add2.setState("Maharashtra");
			add2.setCountry("India");
			add2.setPin(400614);
			
			System.out.println("address is "+add2);
			
			Address add3 = new Address();
			add3.setAddressId(3333333);
			add3.setStreet("First Choice Street");
			add3.setArea("Sector 15");
			add3.setCity("Navi Mumbai");
			add3.setState("Maharashtra");
			add3.setCountry("India");
			add3.setPin(400614);
			
			System.out.println("address is "+add3);
			ArrayList<Address> a1 = new ArrayList<Address>();
			
			Iterator it = a1.iterator();
			a1.add(add3);
			a1.add(add2);
			a1.add(add1);
			
			while(it.hasNext())
			{
				
			
			}
		}
		
		
		

}
class Passport
{
	int passportId;
	private String passportNumber;
	private LocalDate passportIssueDate;
	private LocalDate passportExpiryDate;
	private String issuedBy;
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public LocalDate getPassportIssueDate() {
		return passportIssueDate;
	}
	public void setPassportIssueDate(LocalDate passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	
	public LocalDate getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(LocalDate passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", passportIssueDate="
				+ passportIssueDate + ", passportExpiryDate=" + passportExpiryDate + ", issuedBy=" + issuedBy + "]";
	}
	
	
	
}
class Employee
{
	private	int employeeNo;
	private	String employeeName;
	private	LocalDate employeeJoining;
	private double employeeSalary;
	Passport passport = new Passport();
	ArrayList<Address> addresslist = new ArrayList<Address>();
	ArrayList<Projects> projectslist = new ArrayList<Projects>();
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getEmployeeJoining() {
		return employeeJoining;
	}
	public void setEmployeeJoining(LocalDate employeeJoining) {
		this.employeeJoining = employeeJoining;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public ArrayList<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(ArrayList<Address> addresslist) {
		this.addresslist = addresslist;
	}
	public ArrayList<Projects> getProjectslist() {
		return projectslist;
	}
	public void setProjectslist(ArrayList<Projects> projectslist) {
		this.projectslist = projectslist;
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", employeeJoining="
				+ employeeJoining + ", employeeSalary=" + employeeSalary + ", passport=" + passport + ", addresslist="
				+ addresslist + ", projectslist=" + projectslist + "]";
	}
	
	
}
class Address
{
	private	int addressId;
	private	String area;
	private	String street;
	private	String city;
	private	String state;
	private	String country;
	private	int pin;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", area=" + area + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
abstract class Projects
{
	abstract void projectDeadLine();
	
}
class Banking extends Projects
{
	String vendorName;
	String reconciliationStatus;

	

	public Banking(String vendorName, String reconciliationStatus) {
		super();
		this.vendorName = vendorName;
		this.reconciliationStatus = reconciliationStatus;
	}

	

	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public String getReconciliationStatus() {
		return reconciliationStatus;
	}



	public void setReconciliationStatus(String reconciliationStatus) {
		this.reconciliationStatus = reconciliationStatus;
	}



	@Override
	void projectDeadLine() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Banking [vendorName=" + vendorName + ", reconciliationStatus=" + reconciliationStatus + "]";
	}
	

}
class AirLine extends Projects
{
     
	@Override
	void projectDeadLine() {
		// TODO Auto-generated method stub
		
	}
	
}