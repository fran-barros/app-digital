package com.digital.appdigital.service;

import com.digital.appdigital.domain.customer.Usuario;
import com.digital.appdigital.domain.customer.UsuarioSearch;
import com.digital.appdigital.integration.UsuarioClient;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioClient client;

    public Usuario create(Usuario customer) {
        return client.create(customer);
    }

    public Usuario update(String id, Usuario usuario) {
        return client.update(id, usuario);
    }

    public Usuario getUsuario(String identificador) {

        if(identificador != null)
            try {
                return client.getByCpfEmail(identificador);
            }catch (FeignException e){
                return null;
            }

        return null;
    }
}
