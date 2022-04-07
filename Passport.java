import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport {
	@Id
	@GeneratedValue
	@Column(name="passportId")
	private int passportId;
	
	@Column(name="issuedBy")
	private String issuedBy;
	
	@Column(name="passportIssuedDate")
	private LocalDate passportIssuedDate;
	
	@Column(name="passportExpiryDate")
	private LocalDate passportExpiryDate;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public LocalDate getPassportIssuedDate() {
		return passportIssuedDate;
	}
	public void setPassportIssuedDate(LocalDate passportIssuedDate) {
		this.passportIssuedDate = passportIssuedDate;
	}
	public LocalDate getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(LocalDate passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	
	
}
