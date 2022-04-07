import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class CrudTestingOneToMany {


	EntityManagerFactory emf;
	EntityManager em ;
	
	public CrudTestingOneToMany() {
		System.out.println("CrudTestingOneToMany()....");
		// TODO Auto-generated method stub
				System.out.println("Trying to read persistence.xml file...");
				
				//3
				this.emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created....");
				
				this.em = emf.createEntityManager();
				System.out.println("EntityManager created....");
	}
	@Test
	public void createSingleDepartmentTest() {
		
		Department dept = new Department(1,"Sample","Sample");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.persist(dept);
		tx.commit();
	}
	
	@Test
	public void createNewDepartmentWithNewEmployeesTest() {
		
		Department dept = new Department(40,"Operations","New Mumbai");
		
		Passport passport1 = new Passport();
		passport1.setIssuedBy("Govt. Of. India");
		passport1.setPassportIssuedDate(LocalDate.of(2011, 12, 25));
		passport1.setPassportExpiryDate(LocalDate.of(2021, 12, 25));
		
		Passport passport2 = new Passport();
		passport2.setIssuedBy("Govt. Of. Nepal");
		passport2.setPassportIssuedDate(LocalDate.of(2012, 12, 25));
		passport2.setPassportExpiryDate(LocalDate.of(2022, 12, 25));
		
		Passport passport3 = new Passport();
		passport3.setIssuedBy("Govt. Of. Srilanka");
		passport3.setPassportIssuedDate(LocalDate.of(2013, 12, 25));
		passport3.setPassportExpiryDate(LocalDate.of(2023, 12, 25));
		
		
		Employee emp1 = new Employee("Seeta","DBA",LocalDate.now(),62000,23,passport1,dept);
		Employee emp2 = new Employee("Reeta","DBA",LocalDate.now(),42000,23,passport2,dept);
		Employee emp3 = new Employee("Geeta","DBA",LocalDate.now(),32000,23,passport3,dept);
		
		passport1.setEmp(emp1);
		passport2.setEmp(emp2);
		passport3.setEmp(emp3);
		
		Set <Employee> tempStaff = new HashSet<Employee>();
		tempStaff.add(emp1); //triggering the insert query
		tempStaff.add(emp2);
		tempStaff.add(emp3);
		
		dept.setStaff(tempStaff);
		
		//OR
		
		//dept.getStaff().add(emp1);
		//dept.getStaff().add(emp2);
		//dept.getStaff().add(emp3);
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
			em.persist(dept);
				
		tx.commit();
		
	}
	
}
