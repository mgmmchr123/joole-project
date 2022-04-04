package com.itlizeSession.jooleproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itlizeSession.jooleproject.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
