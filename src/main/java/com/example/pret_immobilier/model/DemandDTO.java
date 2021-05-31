package com.example.pret_immobilier.model;

import com.example.pret_immobilier.validation.Couverture;
import com.example.pret_immobilier.validation.Participation;
import com.sun.istack.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Set;

public class DemandDTO {

    @Min(100000) @Max(600000)
    private int amount;


    private int participation;

    @Min(2) @Max(30)
    private int duration;

    @NotNull
    @Positive
    private BigDecimal interestRate;

    @Positive
    private BigDecimal insuranceRate;

    private boolean jobLostJobInsurance;

    private Integer couverture;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(BigDecimal insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public boolean isJobLostJobInsurance() {
        return jobLostJobInsurance;
    }

    public void setJobLostJobInsurance(boolean jobLostJobInsurance) {
        this.jobLostJobInsurance = jobLostJobInsurance;
    }

    public Integer getCouverture() {
        return couverture;
    }

    public void setCouverture(Integer couverture) {
        this.couverture = couverture;
    }
}







