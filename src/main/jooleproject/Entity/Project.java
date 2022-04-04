package com.itlizeSession.jooleproject.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="time_created")
	private Timestamp timeCreated;
	
	@Column(name="time_updated")
	private Timestamp timeUpdated;
	
	
	public Project() {
		
	}
	public Project(String owner, Timestamp timeCreated, Timestamp timeUpdated) {
		this.owner = owner;
		this.timeCreated = timeCreated;
		this.timeUpdated = timeUpdated;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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
				+ timeUpdated + "]";
	}
	
	
}
