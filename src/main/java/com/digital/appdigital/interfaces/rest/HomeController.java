package com.digital.appdigital.interfaces.rest;

import com.digital.appdigital.service.UsuarioService;
import com.digital.appdigital.domain.customer.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@Controller
public class HomeController {

    private final UsuarioService service;

    @RequestMapping("/home")
    public String home(Model model) {

        return "index";
    }

    @PostMapping("/login")
    public String buscaUsuario(String id, Model model) {
        Usuario usuario = service.getUsuario(id);
        model.addAttribute("usuario", usuario);
        return "cadastro";
    }

    @GetMapping("/novoCadastro")
    public String iniciarCadastro(Usuario usuario, Model model) {
        return "novoCadastro";
    }

    @PostMapping("/create")
    public String cadastroCliente(Usuario usuario, Model model) {
        Usuario usuarioCriado = service.create(usuario);
        model.addAttribute("cadastro", usuarioCriado);
        return "cadastro";
    }

    @PostMapping("/update")
    public String atualizarCadastro(Model model) {
        return "atualizarCadastro";
    }
}
