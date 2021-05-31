package com.example.pret_immobilier.services;

import com.example.pret_immobilier.model.DemandDTO;
import com.example.pret_immobilier.model.DemandView;

import java.util.List;

public interface DemandService {

    List<DemandDTO> getAll();

   void createDemand(DemandView demand);

}
