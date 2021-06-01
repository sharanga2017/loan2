package com.example.pret_immobilier.services;


import com.example.pret_immobilier.model.Demand;
import com.example.pret_immobilier.model.DemandDTO;
import com.example.pret_immobilier.model.DemandView;
import com.example.pret_immobilier.repositories.DemandRepository;
import com.example.pret_immobilier.services.tools.MyModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
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
    public List<DemandDTO> getAll(){

        List<DemandDTO> listDTO = new ArrayList<DemandDTO>();
        List<Demand> list = demandRepository.findAll();

        for (Demand demand: list
        ) {
            DemandDTO demandDTO =  modelMapper.map(demand, DemandDTO.class);
            listDTO.add(demandDTO);

        }
        return listDTO;
    }

    @Override
    public void createDemand(DemandView demand) {
         Demand demandCreated = new Demand();
        demandCreated =  modelMapper.map(demand, Demand.class);
       // Clock cl = Clock.systemUTC();


        ZoneId zoneEuropeParis = ZoneId.of("Europe/Paris");

        Clock clockParis = Clock.system(zoneEuropeParis);
        demandCreated.setDateRequest(LocalDateTime.now(clockParis));
        demandCreated.setInterestRate((demandCreated.getInterestRate()).setScale(2, RoundingMode.HALF_UP));
        demandCreated.setInsuranceRate((demandCreated.getInsuranceRate()).setScale(2,RoundingMode.HALF_UP ));

        demandRepository.save(demandCreated);
    }



    @Override
    public DemandDTO getById(Long id){

        Demand demand = demandRepository.findById(id).get();


            DemandDTO demandDTO =  modelMapper.map(demand, DemandDTO.class);



        return demandDTO;
    }

}
