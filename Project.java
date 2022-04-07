import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	
	@Id
	@GeneratedValue
	@Column(name="projectId")
	private int projectId;
	
	@Column(name="projectTitle")
	private String projectTitle;
	
	@Column(name="projectDeadLine")
	private LocalDate projectDeadLine;
 
 
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getProjectTitle() {
	return projectTitle;
}
public void setProjectTitle(String projectTitle) {
	this.projectTitle = projectTitle;
}
public LocalDate getProjectDeadLine() {
	return projectDeadLine;
}
public void setProjectDeadLine(LocalDate projectDeadLine) {
	this.projectDeadLine = projectDeadLine;
}
 
 
 
}
