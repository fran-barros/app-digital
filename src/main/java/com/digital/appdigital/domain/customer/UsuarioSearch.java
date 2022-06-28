package com.digital.appdigital.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioSearch {
    private String id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
}
