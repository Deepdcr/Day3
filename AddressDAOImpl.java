import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddressDAOImpl implements AddressDAO {
	EntityManagerFactory emf;
	EntityManager em ; 
	
	public AddressDAOImpl()
	{
		System.out.println("AddressDAOImpl.....");
		
		System.out.println("Trying to read persistence.xml file..."); 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}

	public void addAddress(Address address) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(address);
		et.commit();

	}


	public void modifyAddress(Address adr) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.merge(adr);
		et.commit();

	}


	public void deleteAddress(int addressId) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
		Address adr = em.find(Address.class, addressId);
			em.remove(adr);
		et.commit();

	}


	public Address findAddress(int addressId) {
		// TODO Auto-generated method stub
		return em.find(Address.class, addressId);
	}


	public Set<Address> findAllAddress() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Address");
		List<Address> list = query.getResultList();
		Set<Address> adrSet = new HashSet(list);
		return adrSet;
	}
}
