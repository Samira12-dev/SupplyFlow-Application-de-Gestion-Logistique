package com.example.SupplyFlow.repository;

import com.example.SupplyFlow.model.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovementRepo extends JpaRepository<StockMovement, Long> {
}
