package com.jerry.jooleproject.service;

import com.jerry.jooleproject.entity.Project;

import java.util.List;

public interface ProjectService {
    Project saveProject(Project project);

    List<Project> fetchProjectList();

    Project fetchProjectById(Integer id);

    void deleteProjectById(Integer id);

    Project updateProjectById(Project project);
}
