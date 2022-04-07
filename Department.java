import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_tbl")
public class Department {
	@Id
	@GeneratedValue
	@Column(name="deptno")
	private int departmentNumber;
	
	@Column(name="dname")
	private String departmentName;
	
	@Column(name="Loc")
	private String departmentLocation;
	
	@OneToMany
    Set<Employee> staff = new HashSet<Employee>();
	
	

	public Set<Employee> getStaff() {
		return staff;
	}

	public void setStaff(Set<Employee> staff) {
		this.staff = staff;
	}

	public Department() {
		super();
	}

	public Department(String departmentName, String departmentLocation, Set<Employee> staff) {
		super();
	
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
		this.staff = staff;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
	
	
	
	
}
