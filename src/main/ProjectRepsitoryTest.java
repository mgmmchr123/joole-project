package com.itlizeSession.jooleproject.test;

import java.sql.Timestamp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.itlizeSession.jooleproject.Entity.Project;
import com.itlizeSession.jooleproject.Repository.ProjectRepository;

@SpringBootTest
class ProjectRepsitoryTest {
	@Autowired
	private ProjectRepository repository;
	@Test
	void test() {
		Timestamp time1 = new Timestamp(System.currentTimeMillis());
		Timestamp time2 = new Timestamp(System.currentTimeMillis());
		Project pro = new Project("Fisher",time1,time2);
		
		repository.save(pro);
		Assertions.assertThat(pro.getId()).isGreaterThan(0);
	}

}
