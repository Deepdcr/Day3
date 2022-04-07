
import java.time.LocalDate;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CrudTesting {
	


		@Test
		public void createEmployeeTest() {
			// TODO Auto-generated method stub
		 System.out.println("trying to read xml file......");
		 
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		 System.out.println("EntityManagerFactory created");
		 
		 EntityManager em = emf.createEntityManager();
		 System.out.println("EntityManager created");
		 
		 EntityTransaction et = em.getTransaction();
		 System.out.println("EntityTransaction created");
		 
		 System.out.println("Trying to create record....");
/*		 Employee theEmp = new Employee();
		 //theEmp.setEmployeeNumber(102);
		 theEmp.setEmployeeName("jane");
		 theEmp.setEmployeeJob("asst. manager");
		 theEmp.setJoiningDate(LocalDate.of(2022, 11, 10));
		 theEmp.setSalary(95000); 
		 theEmp.setAge(23);  */
		 
	 Employee theEmp = em.find(Employee.class, 4);
		 Assertions.assertTrue(theEmp!=null);
		 //theEmp.setEmployeeNumber(102);
		System.out.println("Emp number   : "+theEmp.getEmployeeNumber());
		System.out.println("Emp name     : "+theEmp.getEmployeeName());
		System.out.println("Emp job      : "+theEmp.getEmployeeJob());
		System.out.println("Emp sal      : "+theEmp.getSalary());
		System.out.println("Emp age      : "+theEmp.getAge());  
		
		 et.begin();
		 	em.persist(theEmp);
		 et.commit();
		 
		 System.out.println("trying to read record....");
		 Employee theEmp = new Employee();
		 //theEmp.setEmployeeNumber(102);
		 theEmp.setEmployeeName("jane");
		 theEmp.setEmployeeJob("asst. manager");
		 theEmp.setJoiningDate(LocalDate.of(2022, 11, 10));
		 theEmp.setSalary(95000); 
		 theEmp.setAge(23); 
				 }
		
		
/*


@Test
public void updateEmployeeTest() {
	// TODO Auto-generated method stub
 System.out.println("trying to read xml file......");
 
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
 Assertions.assertTrue(emf!=null);
 System.out.println("EntityManagerFactory created");
 
 EntityManager em = emf.createEntityManager();
 Assertions.assertTrue(em!=null);
 System.out.println("EntityManager created");
 
 EntityTransaction et = em.getTransaction();
 Assertions.assertTrue(et!=null);
 System.out.println("EntityTransaction created");
 
 et.begin();
 System.out.println("Trying to create record....");
 Employee theEmp = em.find(Employee.class, 4);
 Assertions.assertTrue(theEmp!=null);
 theEmp.setEmployeeNumber(5);
System.out.println("Emp number   : "+theEmp.getEmployeeNumber());
System.out.println("Emp name     : "+theEmp.getEmployeeName());
System.out.println("Emp job      : "+theEmp.getEmployeeJob());
System.out.println("Emp sal      : "+theEmp.getSalary());
System.out.println("Emp age      : "+theEmp.getAge()); 

System.out.println("trying to maKE CHANGES IN THE ATTACHED OBJECT");
theEmp.setEmployeeName("joycee");
theEmp.setEmployeeJob("analyst");
theEmp.setSalary(50000);
theEmp.setAge(30);

em.merge(theEmp);
System.out.println("transaction completed");
et.commit();
}*/

@Test
public void updateEmployeeTest() {
	// TODO Auto-generated method stub
 System.out.println("trying to read xml file......");
 
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
 Assertions.assertTrue(emf!=null);
 System.out.println("EntityManagerFactory created");
 
 EntityManager em = emf.createEntityManager();
 Assertions.assertTrue(em!=null);
 System.out.println("EntityManager created");
 
 EntityTransaction et = em.getTransaction();
 Assertions.assertTrue(et!=null);
 System.out.println("EntityTransaction created");
 
 et.begin();
 System.out.println("Trying to create record....");
 Employee theEmp = new Employee();
 //Assertions.assertTrue(theEmp!=null);
 theEmp.setEmployeeNumber(5);
System.out.println("Emp number   : "+theEmp.getEmployeeNumber());
System.out.println("Emp name     : "+theEmp.getEmployeeName());
System.out.println("Emp job      : "+theEmp.getEmployeeJob());
System.out.println("Emp sal      : "+theEmp.getSalary());
System.out.println("Emp age      : "+theEmp.getAge()); 

System.out.println("trying to maKE CHANGES IN THE ATTACHED OBJECT");
theEmp.setEmployeeName("joycee");
theEmp.setEmployeeJob("analyst");
theEmp.setSalary(50000);
theEmp.setAge(30);

em.merge(theEmp);
System.out.println("transaction completed");
et.commit();
}}




