package com.example.pret_immobilier.controllers;

import com.example.pret_immobilier.model.DemandCreated;
import com.example.pret_immobilier.services.DemandService;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/demands")
public class DemandController {


    private final DemandService demandService;

    public DemandController(DemandService demandService) {
        this.demandService = demandService;
    }




    // ex : POST https://localhost:8080/api/demands/add/
    @PostMapping("/add")
    public String addDemand(@RequestBody @Valid DemandCreated demand) {
         demandService.createDemand(demand);
        return "Demand added";
    }





}
