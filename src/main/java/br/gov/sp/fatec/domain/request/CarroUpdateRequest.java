package br.gov.sp.fatec.domain.request;

import br.gov.sp.fatec.domain.enums.CarroStatus;
import lombok.Data;

@Data
public class CarroUpdateRequest {
    private String modelo;
    private String marca;
    private int ano;
    private CarroStatus status;
}
