package com.jerry.jooleproject.service.impl;

import com.jerry.jooleproject.entity.Project;
import com.jerry.jooleproject.entity.TechnicalDetail;
import com.jerry.jooleproject.repository.TechnicalDetailRepository;
import com.jerry.jooleproject.service.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicalDetailServiceImpl implements TechnicalDetailService {
    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;

    @Override
    public TechnicalDetail saveTechnicalDetail(TechnicalDetail technicalDetail){
            return technicalDetailRepository.save(technicalDetail);
    }

    @Override
    public List<TechnicalDetail> fetchTechnicalDetailList() {
        return technicalDetailRepository.findAll();
    }

    @Override
    public TechnicalDetail fetchTechnicalDetailById(Integer id) {
        return technicalDetailRepository.findById(id).get();
    }

    @Override
    public void deleteTechnicalDetailById(Integer id) {
        technicalDetailRepository.deleteById(id);
    }

    @Override
    public TechnicalDetail updateTechnicalDetailById(TechnicalDetail technicalDetail) {
        return technicalDetailRepository.save(technicalDetail);
    }
}
