package com.cashflowhogar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cashflowhogar.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}
