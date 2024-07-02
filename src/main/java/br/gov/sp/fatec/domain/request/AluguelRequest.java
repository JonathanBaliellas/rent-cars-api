package br.gov.sp.fatec.domain.request;

import lombok.Data;
import java.util.Date;

import br.gov.sp.fatec.domain.enums.AluguelStatus;

@Data
public class AluguelRequest {
    private Date dataInicio;
    private Date dataFim;
    private double valor;
    private AluguelStatus status;
    private Long carroId;
    private Long clienteId;
}
