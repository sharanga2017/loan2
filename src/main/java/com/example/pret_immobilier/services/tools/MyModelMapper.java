package com.example.pret_immobilier.services.tools;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyModelMapper extends ModelMapper {
    public MyModelMapper() {
        super();
    }
}

