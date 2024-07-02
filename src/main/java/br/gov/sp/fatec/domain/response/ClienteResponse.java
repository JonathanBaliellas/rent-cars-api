package br.gov.sp.fatec.domain.response;

import lombok.Data;

@Data
public class ClienteResponse {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
}
