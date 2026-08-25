package com.Mateus.assistencia_tecnica_api.repository;

import com.Mateus.assistencia_tecnica_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{
}
