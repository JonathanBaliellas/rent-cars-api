package br.gov.sp.fatec.domain.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import br.gov.sp.fatec.domain.entity.Cliente;
import br.gov.sp.fatec.domain.request.ClienteRequest;
import br.gov.sp.fatec.domain.request.ClienteUpdateRequest;
import br.gov.sp.fatec.domain.response.ClienteResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = SPRING)
public interface ClienteMapper {
    Cliente map(ClienteRequest source);

    ClienteResponse map(Cliente aluguel);

    void updateEntity(ClienteUpdateRequest source, @MappingTarget Cliente target);
}
