package com.Mateus.assistencia_tecnica_api.service;


import com.Mateus.assistencia_tecnica_api.model.Cliente;
import com.Mateus.assistencia_tecnica_api.model.OrdemServico;
import com.Mateus.assistencia_tecnica_api.model.Status;
import com.Mateus.assistencia_tecnica_api.repository.ClienteRepository;
import com.Mateus.assistencia_tecnica_api.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrdemServicoService {

    private final OrdemServicoRepository ordemServicoRepository;
    private final ClienteRepository clienteRepository;

    public OrdemServicoService(OrdemServicoRepository ordemServicoRepository, ClienteRepository clienteRepository) {
        this.ordemServicoRepository = ordemServicoRepository;
        this.clienteRepository = clienteRepository;
    }

    public List<OrdemServico> listarTodos() {
        return ordemServicoRepository.findAll();
    }

    public OrdemServico buscarPorID(Integer id){
        return ordemServicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ordem não encontrada com ID: " + id));
    }

    public OrdemServico criar(OrdemServico ordemServico){
        Cliente cliente = clienteRepository.findById((int) ordemServico.getCliente().getID()).orElseThrow(()
                -> new ResourceNotFoundException("Cliente não encontrado com ID: " + ordemServico.getCliente().getID()));
        ordemServico.setCliente(cliente);
        return ordemServicoRepository.save(ordemServico);
    }

    public void delete(Integer id){
        ordemServicoRepository.deleteById(id);
    }

    public OrdemServico finalizarOS(Integer id ){
        OrdemServico os = ordemServicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ordem de serviço não encontrada com ID: " + id));

            os.setStatus(Status.FINALIZADO);
            os.setDataFinalizada(LocalDate.now());
            return ordemServicoRepository.save(os);
    }

}
