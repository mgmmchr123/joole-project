package springbootjooleproject.Entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="time_created")
	private Timestamp timeCreated;
	
	@Column(name="time_updated")
	private Timestamp timeUpdated;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="project_id")
    Set<ProjectProduct> projectProduct;
	
	
	public Project() {
		
	}
	public Project( String owner,Timestamp timeCreated, Timestamp timeUpdated) {
		this.owner = owner;
		this.timeCreated = timeCreated;
		this.timeUpdated = timeUpdated;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Set<ProjectProduct> getProjectProduct() {
		return projectProduct;
	}
	public void setProjectProduct(Set<ProjectProduct> projectProduct) {
		this.projectProduct = projectProduct;
	}
	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Timestamp getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Timestamp timeUpdated) {
		this.timeUpdated = timeUpdated;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", owner=" + owner + ", timeCreated=" + timeCreated + ", timeUpdated="
				+ timeUpdated + ", projectProduct=" + projectProduct + "]";
	}

	
	
}
