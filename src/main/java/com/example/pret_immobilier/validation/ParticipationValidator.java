package com.example.pret_immobilier.validation;

import com.example.pret_immobilier.model.DemandCreated;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParticipationValidator implements ConstraintValidator<Participation, DemandCreated> {

    @Override
    public boolean isValid(DemandCreated demand, ConstraintValidatorContext context) {
           int amount = demand.getAmount();

         int haff = demand.getAmount()/2 ;
        return (demand.getParticipation() >= 0 && demand.getParticipation() <= haff)  ? true :false;
    }
}