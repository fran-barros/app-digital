package com.digital.appdigital.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

    private String cpf;
    private String nome;
    private String email;
    private String dataNascimento;
    private List<Contato> contatos;
    private Endereco endereco;
}
