package com.cashflowhogar.service;

import com.cashflowhogar.model.Movimiento;
import com.cashflowhogar.repository.MovimientoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovimientoService {

    private final MovimientoRepository repository;

    public MovimientoService(MovimientoRepository repository) {
        this.repository = repository;
    }

    public List<Movimiento> listar() {
        return repository.findAll();
    }

    public void guardar(Movimiento movimiento) {
        repository.save(movimiento);
    }
}