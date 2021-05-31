package com.example.pret_immobilier.validation;

import com.example.pret_immobilier.model.Choice;
import com.example.pret_immobilier.model.DemandView;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



import java.util.List;

public class CouvertureValidator implements ConstraintValidator<Couverture, DemandView> {

        @Override
        public boolean isValid(DemandView demandView, ConstraintValidatorContext context) {

            List<Integer> list = Choice.getListRates();

           int choice =  demandView.getCouverture();
            if(demandView.isJobLostJobInsurance())
            {
                return list.contains(choice);
            }
            else
            {
                return false;
            }



        }
    }

