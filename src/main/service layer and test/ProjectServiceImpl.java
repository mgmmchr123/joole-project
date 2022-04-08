package com.jerry.jooleproject.service.impl;

import com.jerry.jooleproject.entity.Project;
import com.jerry.jooleproject.repository.ProjectRepository;
import com.jerry.jooleproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project saveProject(Project project) {

        return projectRepository.save(project);
    }
    @Override
    public List<Project> fetchProjectList() {

        return projectRepository.findAll();
    }
    @Override
    public Project fetchProjectById(Integer id) {

        return projectRepository.findById(id).get();
    }
    @Override
    public void deleteProjectById(Integer id) {
        projectRepository.deleteById(id);

    }
    @Override
    public Project updateProjectById(Project project) {

        return projectRepository.save(project);
    }

}

