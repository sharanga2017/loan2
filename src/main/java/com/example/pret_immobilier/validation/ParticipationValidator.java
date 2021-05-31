package com.example.pret_immobilier.validation;

import com.example.pret_immobilier.model.DemandView;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

public class ParticipationValidator implements ConstraintValidator<Participation, DemandView > {

    @Override
    public boolean isValid(DemandView demand, ConstraintValidatorContext context) {
           int amount = demand.getAmount();

         int haff = demand.getAmount()/2 ;
        return (demand.getParticipation() >= 0 && demand.getParticipation() <= haff)  ? true :false;
    }
}