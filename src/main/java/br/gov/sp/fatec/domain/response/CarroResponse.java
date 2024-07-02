package br.gov.sp.fatec.domain.response;

import br.gov.sp.fatec.domain.enums.CarroStatus;
import lombok.Data;

@Data
public class CarroResponse {
    private Long id;
    private String modelo;
    private String marca;
    private int ano;
    private CarroStatus status;
}
