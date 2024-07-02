package br.gov.sp.fatec.domain.request;

import lombok.Data;

@Data
public class ClienteUpdateRequest {
    private String nome;
    private String telefone;
}
