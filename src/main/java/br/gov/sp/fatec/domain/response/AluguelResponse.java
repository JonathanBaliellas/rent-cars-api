package br.gov.sp.fatec.domain.response;

import lombok.Data;
import java.util.Date;

import br.gov.sp.fatec.domain.enums.AluguelStatus;

@Data
public class AluguelResponse {
    private Long id;
    private Date dataInicio;
    private Date dataFim;
    private double valor;
    private AluguelStatus status;
    private CarroResponse carro;
    private ClienteResponse cliente;
}
