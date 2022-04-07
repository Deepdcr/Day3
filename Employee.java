import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="emp_tbl")
public class Employee {
	
	
	@Id
	@GeneratedValue
	@Column(name="emp_no")
	private int employeeNumber;
	
	@Column(name="emp_name",length = 20)
	private String employeeName;
	
	@Column(name="emp_job",length = 20)
	private String employeeJob;
	
	@Column(name="emp_doj")
	private LocalDate joiningDate;
	
	@Column(name="emp_sal")
	private double salary;
	
	@Column(name="emp_age")
	private Integer age;
	
	@OneToOne
	private Passport passport;
	
	@ManyToOne
	@JoinColumn(name="dno")
	Department dept;
	
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Employee() {
		super();
		System.out.println("pojo is created...");
	//	this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeJob = employeeJob;
		this.joiningDate = joiningDate;
		this.salary = salary;  
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
