package com.Mateus.assistencia_tecnica_api.controller;


import com.Mateus.assistencia_tecnica_api.model.OrdemServico;
import com.Mateus.assistencia_tecnica_api.service.OrdemServicoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordem_servico")
public class OrdemServicoController {


    private final OrdemServicoService ordemServicoService;

    public OrdemServicoController(OrdemServicoService ordemServicoService) {
        this.ordemServicoService = ordemServicoService;
    }

    @GetMapping
    public List<OrdemServico> listarTodos() {
        return ordemServicoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<OrdemServico> criar(@Valid @RequestBody OrdemServico ordemServico) {
        OrdemServico ordem = ordemServicoService.criar(ordemServico);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordem);

    }
    @GetMapping("/{id}")
    public OrdemServico buscarPorId(@PathVariable Integer id) {
        return ordemServicoService.buscarPorID(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        ordemServicoService.delete(id);
    }

    @PutMapping("/{id}/finalizar")
    public OrdemServico finalizar(@PathVariable Integer id){
        return ordemServicoService.finalizarOS(id);
    }
}
