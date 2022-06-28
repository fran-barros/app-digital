package com.digital.appdigital.integration;

import com.digital.appdigital.domain.customer.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "usuario", url = "${integration.usuario.host}")
public interface UsuarioClient {

    @PostMapping(value = "/api/v1/usuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Usuario create(@RequestBody Usuario usuario);

    @PutMapping(value = "/api/v1/usuario",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Usuario update(@RequestHeader("identificador") String identificador,
                   @RequestBody Usuario usuario);

    @RequestMapping(value = "/api/v1/usuario",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    Usuario getByCpfEmail(@RequestHeader(value = "identificador") String identificador);

    @RequestMapping(value = "/api/v1/usuario/all",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    List<Usuario> getAll();
}
