package br.gov.sp.fatec.domain.entity;

import java.util.List;

import br.gov.sp.fatec.domain.enums.CarroStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Carro {
    @Id
    @GeneratedValue
    private Long id;
    private String modelo;
    private String marca;
    private int ano;

    @Enumerated(value = EnumType.STRING)
    private CarroStatus status;

    @OneToMany(mappedBy = "carro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aluguel> alugueis;
}
