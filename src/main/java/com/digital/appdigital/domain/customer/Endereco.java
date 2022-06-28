package com.digital.appdigital.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private Integer id;
    private String logradouro;
    private String cidade;
    private String cep;
    private String pais;
}
