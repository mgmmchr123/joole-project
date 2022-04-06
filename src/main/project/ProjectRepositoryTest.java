package springbootjooleproject.Repository;

import java.sql.Timestamp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import springbootjooleproject.Entity.Project;

@SpringBootTest
class ProjectRepositoryTest {
	@Autowired
	private ProjectRepository repository;
	@Test
	public void saveProject() {
		String str1="2018-09-01 09:01:15";  
        Timestamp timestamp1= Timestamp.valueOf(str1);  
        String str2="2019-09-01 09:01:15";  
        Timestamp timestamp2= Timestamp.valueOf(str2);
        Project project = new Project("sdfsda",timestamp1,timestamp2);
        project.setOwner("adasd");
		repository.save(project);
		
		Assertions.assertThat(project.getId()).isGreaterThan(0);
	}

}
