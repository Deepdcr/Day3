import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PassportDAOImpl implements PassportDAO {

	EntityManagerFactory emf;
	EntityManager em ; 
	
	public PassportDAOImpl()
	{
		System.out.println("PassportDAOImpl.....");
		
		System.out.println("Trying to read persistence.xml file..."); 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}

	public void addPassport(Passport passport) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(passport);
		et.commit();

	}


	public void modifyPassport(Passport pprt) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.merge(pprt);
		et.commit();

	}


	public void deletePassport(int passportId) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
		Passport pprt = em.find(Passport.class, passportId);
			em.remove(passportId);
		et.commit();

	}


	public Passport findPassport(int passportId) {
		// TODO Auto-generated method stub
		return em.find(Passport.class, passportId);
	}


	public Set<Passport> findAllPassport() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Passport");
		List<Passport> list = query.getResultList();
		Set<Passport> pprtSet = new HashSet(list);
		return pprtSet;
	}
}
