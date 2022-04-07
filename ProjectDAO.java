import java.util.Set;

public interface ProjectDAO {
	void addProject(Project project);
	void modifyProject(Project prj);
	void deleteProject(int projectId);
	Project findProject(int projectId);
	Set<Project> findAllProject();
}
