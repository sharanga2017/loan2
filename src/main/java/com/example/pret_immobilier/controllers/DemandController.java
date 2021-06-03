package com.example.pret_immobilier.controllers;

import com.example.pret_immobilier.model.Demand;
import com.example.pret_immobilier.model.DemandDTO;
import com.example.pret_immobilier.model.DemandView;
import com.example.pret_immobilier.services.DemandService;
import com.example.pret_immobilier.validation.Participation;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/demands")
public class DemandController {


    private final DemandService demandService;

    public DemandController(DemandService demandService) {
        this.demandService = demandService;
    }




    // ex : POST https://localhost:8080/api/demands/add/
    @PostMapping("/add")
    public String addDemand(@RequestBody @Valid DemandView demand) {
         demandService.createDemand(demand);
        return "Demand added";
    }





}
