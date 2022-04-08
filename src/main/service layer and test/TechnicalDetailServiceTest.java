package com.jerry.jooleproject.servicetest;

import com.jerry.jooleproject.entity.Project;
import com.jerry.jooleproject.entity.TechnicalDetail;
import com.jerry.jooleproject.repository.ProjectRepository;

import com.jerry.jooleproject.repository.TechnicalDetailRepository;
import com.jerry.jooleproject.service.TechnicalDetailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TechnicalDetailServiceTest {

    @Autowired
    private TechnicalDetailService service;

    @MockBean
    private TechnicalDetailRepository repository;

    @Test
    //@Ignore
    public void saveTechnicalDetail(){
        TechnicalDetail tech = new TechnicalDetail("sample details:1111");

        when(repository.save(tech)).thenReturn(tech);

        assertThat(service.saveTechnicalDetail(tech)).isEqualTo(tech);

    }


    @Test
    public void fetchTechnicalDetailById(){
        TechnicalDetail tech = new TechnicalDetail("sample details:1111");

        when(repository.findById(1)).thenReturn(Optional.of(tech));
        assertThat(service.fetchTechnicalDetailById(1)).isEqualTo(tech);
    }

    @Test
    public void fetchProjectList(){
        TechnicalDetail tech1 = new TechnicalDetail("sample details:1111");
        tech1.setDetails("Wells123");


        TechnicalDetail tech2 = new TechnicalDetail("sample details:1111");
        tech2.setDetails("Wells12223");

        List<TechnicalDetail> ticketList = new ArrayList<>();
        ticketList.add(tech1);
        ticketList.add(tech2);

        when(repository.findAll()).thenReturn(ticketList);

        assertThat(service.fetchTechnicalDetailList()).isEqualTo(ticketList);
    }


    @Test
    public void deleteTechnicalDetailById(){


        TechnicalDetail tech1 = new TechnicalDetail("sample details:1111");
        tech1.setDetails("Wells123");
        when(repository.findById((int) tech1.getId())).thenReturn(Optional.of(tech1));
        service.deleteTechnicalDetailById(0);
        verify(repository).deleteById((int) tech1.getId());
    }


    @Test
    public void updateProjectById(){
        TechnicalDetail tech1 = new TechnicalDetail("sample details:1111");
        tech1.setDetails("Wells123");

        when(repository.findById(1)).thenReturn(Optional.of(tech1));

        tech1.setDetails("Waa12al123");
        when(repository.save(tech1)).thenReturn(tech1);

        assertThat(service.updateTechnicalDetailById(tech1)).isEqualTo(tech1);

    }



}
