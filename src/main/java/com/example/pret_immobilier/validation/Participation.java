package com.example.pret_immobilier.validation;

import javax.validation.*;


import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = {ParticipationValidator.class})
@ReportAsSingleViolation
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE})
@Documented
public @interface Participation {


    String message() default "The participation have to positive and < 50 ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
