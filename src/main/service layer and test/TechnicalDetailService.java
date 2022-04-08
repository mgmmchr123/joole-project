package com.jerry.jooleproject.service;

import com.jerry.jooleproject.entity.Project;
import com.jerry.jooleproject.entity.TechnicalDetail;

import java.util.List;

public interface TechnicalDetailService {
    TechnicalDetail saveTechnicalDetail(TechnicalDetail technicalDetail);

    List<TechnicalDetail> fetchTechnicalDetailList();

    TechnicalDetail fetchTechnicalDetailById(Integer id);

    void deleteTechnicalDetailById(Integer id);

    TechnicalDetail updateTechnicalDetailById(TechnicalDetail technicalDetail);
}
