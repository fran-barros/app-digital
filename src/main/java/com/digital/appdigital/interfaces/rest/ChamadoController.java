package com.digital.appdigital.interfaces.rest;

import com.digital.appdigital.application.customer.ChamadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;


@AllArgsConstructor
@Controller
public class ChamadoController {
/*
    private final ChamadoService service;

    @GetMapping("/chamados/protocolo/{protocolo}")
    public String buscarChamadoByProtocolo(@PathVariable("protocolo") Integer protocolo, Model model) {
        System.out.println("chamados by protocolo");
        Chamado chamado = service.findByProtocolo(protocolo);
        model.addAttribute("chamado", chamado);
        return "chamado";
    }

    @GetMapping("/chamados/cpf/{cpf}")
    public String buscarChamadoByCpf(@PathVariable("cpf") String cpf, Model model) {
        System.out.println("chamados by cpf");
        List<Chamado> chamados = service.findByCpf(cpf);
        model.addAttribute("chamados", chamados);
        return "chamados";
    }

    @GetMapping("/chamados/all")
    public String buscarChamados(Model model) {
        System.out.println("todos os chamados");
        List<Chamado> chamados = service.getAll();
        model.addAttribute("chamados", chamados);
        return "chamados";
    }

    @GetMapping("/novoChamado")
    public String iniciarCadastro(Chamado chamado, Model model) {
        return "novoChamado";
    }

    @PostMapping("/novo")
    public String criarChamado(Chamado chamado, BindingResult result, Model model) {
        Chamado chamadoResponse = service.criarChamado(chamado);
        List<Chamado> chamados = new ArrayList<>();
        if(chamadoResponse != null) {
            chamados = service.findByCpf(chamado.getCpf());
        }
        model.addAttribute("chamados", chamados);
        return "chamados";
    }

    @PostMapping("/chamados/alterar/{protocolo}")
    public String atualizarChamado(@PathVariable("protocolo") Integer protocolo, Model model) {
        Chamado chamado = service.findByProtocolo(protocolo);
        model.addAttribute("chamado", chamado);
        return "atualizarChamado";
    }

    @GetMapping("/chamados/{protocolo}")
    public String deleteChamado(@PathVariable("protocolo") Integer protocolo, Model model) {
        service.deletarChamado(protocolo);
        return "redirect:/home";
    }*/
}
