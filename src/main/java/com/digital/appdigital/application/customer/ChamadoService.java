package com.digital.appdigital.application.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChamadoService {
    /*
    private final ChamadoClient client;

    public Chamado findByProtocolo(Integer protocolo) {
        try {
            return client.getByProtocolo(protocolo);
        }catch (FeignException e){
            return null;
        }
    }

    public List<Chamado> findByCpf(String cpf) {
        try {
            return client.findByCpf(cpf);
        }catch (FeignException e){
            return null;
        }
    }

    public List<Chamado> getAll() {
        try {
            return client.getAll();
        }catch (FeignException e){
            return null;
        }
    }

    public Chamado criarChamado(Chamado chamado){
       return client.create(chamado);
    }

    public void deletarChamado(Integer protocolo){
        client.delete(protocolo);
    }*/
}
