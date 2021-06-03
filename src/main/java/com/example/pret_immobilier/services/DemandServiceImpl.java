package com.example.pret_immobilier.services;


import com.example.pret_immobilier.model.Demand;
import com.example.pret_immobilier.model.DemandCreated;
import com.example.pret_immobilier.repositories.DemandRepository;
import com.example.pret_immobilier.services.tools.MyModelMapper;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.math.*;

@Service
public class DemandServiceImpl implements DemandService  {


    private final DemandRepository demandRepository;
    private final MyModelMapper modelMapper;

    public DemandServiceImpl(DemandRepository demandRepository, MyModelMapper modelMapper) {

        this.demandRepository = demandRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void createDemand(DemandCreated demand) {
         Demand demandCreated = new Demand();
        demandCreated =  modelMapper.map(demand, Demand.class);
        ZoneId zoneEuropeParis = ZoneId.of("Europe/Paris");

        Clock clockParis = Clock.system(zoneEuropeParis);
        demandCreated.setDateRequest(LocalDateTime.now(clockParis));
        demandCreated.setInterestRate((demandCreated.getInterestRate()).setScale(2, RoundingMode.HALF_UP));
        demandCreated.setInsuranceRate((demandCreated.getInsuranceRate()).setScale(2,RoundingMode.HALF_UP ));

        demandRepository.save(demandCreated);
    }





}
