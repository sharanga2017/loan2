package com.example.pret_immobilier.validation;

import com.example.pret_immobilier.model.Choice;
import com.example.pret_immobilier.model.DemandCreated;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



import java.util.List;

public class CouvertureValidator implements ConstraintValidator<Couverture, DemandCreated> {

        @Override
        public boolean isValid(DemandCreated demandCreated, ConstraintValidatorContext context) {

            List<Integer> list = Choice.getListRates();

           int choice =  demandCreated.getCouverture();
            if(demandCreated.getJobLostJobInsurance())
            {
                return list.contains(choice);
            }
            else
            {
                return false;
            }



        }
    }

