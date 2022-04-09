package com.jerry.jooleproject.controller;

import com.jerry.jooleproject.entity.TechnicalDetail;
import com.jerry.jooleproject.service.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TechnicalDetailController {
    @Autowired
    private TechnicalDetailService technicalDetailService;

    @PostMapping("/technicalDetail")
    public TechnicalDetail saveTechnicalDetail(@RequestBody TechnicalDetail technicalDetail){
        return technicalDetailService.saveTechnicalDetail(technicalDetail);
    }
    @GetMapping("/technicalDetail")
    public List<TechnicalDetail> fetchTechnicalDetailList(){
        return technicalDetailService.fetchTechnicalDetailList();
    }
    @GetMapping("/technicalDetail/{id}")
    public TechnicalDetail fetchTechnicalDetailById(@PathVariable("id") Integer id){
        return technicalDetailService.fetchTechnicalDetailById(id);
    }
    @DeleteMapping("/technicalDetail/{id}")
    public String deleteTechnicalDetailById(@PathVariable("id") Integer id){
        technicalDetailService.deleteTechnicalDetailById(id);
        return "TechnicalDetails is deleted successfully";
    }
    @PutMapping("/technicalDetail")
    public TechnicalDetail updateTechnicalDetailById(@RequestBody TechnicalDetail technicalDetail){
        return technicalDetailService.updateTechnicalDetailById(technicalDetail);
    }
}
