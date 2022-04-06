package springbootjooleproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootjooleproject.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer>{

}
