package com.example.pret_immobilier.repositories;

import com.example.pret_immobilier.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandRepository extends JpaRepository<Demand, Long> {
}
