package br.gov.sp.fatec.domain.entity;

import java.util.Date;

import br.gov.sp.fatec.domain.enums.AluguelStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Aluguel {

    @Id
    @GeneratedValue
    private Long id;
    private Date dataInicio;
    private Date dataFim;
    private double valor;
    
    @Enumerated(value = EnumType.STRING)
    private AluguelStatus status;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
