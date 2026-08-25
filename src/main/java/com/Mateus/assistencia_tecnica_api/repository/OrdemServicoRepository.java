package com.Mateus.assistencia_tecnica_api.repository;

import com.Mateus.assistencia_tecnica_api.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {
}
