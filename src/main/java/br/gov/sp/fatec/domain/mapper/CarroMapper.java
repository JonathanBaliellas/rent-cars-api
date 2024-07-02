package br.gov.sp.fatec.domain.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.request.CarroUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import br.gov.sp.fatec.domain.response.CarroResponse;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = SPRING)
public interface CarroMapper {
    Carro map(CarroRequest source);

    CarroResponse map(Carro source);

    void updateEntity(CarroUpdateRequest source, @MappingTarget Carro target);
}
