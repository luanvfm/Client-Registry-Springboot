package com.minhaempresa.cadastroclientes.repository;

import com.minhaempresa.cadastroclientes.model.Cliente;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}