import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CrudTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("trying to read xml file......");
	 
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	 System.out.println("EntityManagerFactory created");
	 
	 EntityManager em = emf.createEntityManager();
	 System.out.println("EntityManager created");
	 
	 EntityTransaction et = em.getTransaction();
	 System.out.println("EntityTransaction created");
	 
	 System.out.println("Trying to create record....");
	 Employee theEmp = new Employee();
	 theEmp.setEmployeeNumber(101);
	 theEmp.setEmployeeName("jack");
	 theEmp.setEmployeeJob("manager");
	 theEmp.setJoiningDate(LocalDate.of(2020, 11, 10));
	 theEmp.setSalary(35000);
	 
	 et.begin();
	 	em.persist(theEmp);
	 et.commit();
	 
	 System.out.println("created the record....");
			 }

}
