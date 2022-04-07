import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProjectDAOImpl implements ProjectDAO {

	EntityManagerFactory emf;
	EntityManager em ; 
	
	public ProjectDAOImpl()
	{
		System.out.println("ProjectDAOImpl.....");
		
		System.out.println("Trying to read persistence.xml file..."); 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
	}

	public void addProject(Project project) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(project);
		et.commit();

	}


	public void modifyProject(Project prj) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.merge(prj);
		et.commit();

	}


	public void deleteProject(int projectId) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
		Project prj = em.find(Project.class, projectId);
			em.remove(projectId);
		et.commit();

	}


	public Project findProject(int projectId) {
		// TODO Auto-generated method stub
		return em.find(Project.class, projectId);
	}


	public Set<Project> findAllProject() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Passport");
		List<Project> list = query.getResultList();
		Set<Project> prjSet = new HashSet(list);
		return prjSet;
	}
}
