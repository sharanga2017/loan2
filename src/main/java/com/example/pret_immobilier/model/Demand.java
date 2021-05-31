package com.example.pret_immobilier.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "demands")
public class Demand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int amount;

    private int participation;
    private int duration;
    private BigDecimal interestRate;
    private BigDecimal insuranceRate;
    private boolean jobLossInsurance;
    private Integer couverture;

    private LocalDate dateRequest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public boolean isJobLossInsurance() {
        return jobLossInsurance;
    }

    public void setJobLossInsurance(boolean jobLossInsurance) {
        this.jobLossInsurance = jobLossInsurance;
    }

    public Integer getCouverture() {
        return couverture;
    }

    public void setCouverture(Integer couverture) {
        this.couverture = couverture;
    }

    public LocalDate getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(LocalDate dateRequest) {
        this.dateRequest = dateRequest;
    }



}
