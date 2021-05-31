package com.example.pret_immobilier.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.*;


import javax.validation.*;


        import javax.validation.Payload;
        import java.lang.annotation.*;

@Constraint(validatedBy = {CouvertureValidator.class})
@ReportAsSingleViolation
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE})
@Documented
public @interface Couverture {


    String message() default "The couverture have to be 30,40, 50, 60 and 70 or jobLostJobInsurance have to be TRUE ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}