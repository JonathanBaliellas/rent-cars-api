package br.gov.sp.fatec.service.impl;

import br.gov.sp.fatec.domain.entity.Aluguel;
import br.gov.sp.fatec.domain.mapper.AluguelMapper;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.request.AluguelUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import br.gov.sp.fatec.repository.AluguelRepository;
import br.gov.sp.fatec.service.AluguelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AluguelServiceImpl implements AluguelService {

    private final AluguelRepository aluguelRepository;
    private final AluguelMapper aluguelMapper;

    @Override
    public AluguelResponse save(AluguelRequest aluguelRequest) {
        Aluguel aluguel = aluguelMapper.map(aluguelRequest);
        aluguel = aluguelRepository.save(aluguel);
        return aluguelMapper.map(aluguel);
    }

    @Override
    public AluguelResponse findById(Long id) {
        Aluguel aluguel = aluguelRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluguel não encontrado"));
        return aluguelMapper.map(aluguel);
    }

    @Override
    public List<AluguelResponse> findAll() {
        return aluguelRepository.findAll().stream()
                .map(aluguelMapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public void updateById(Long id, AluguelUpdateRequest aluguelUpdateRequest) {
        Aluguel aluguel = aluguelRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluguel não encontrado"));
        aluguelMapper.updateEntity(aluguelUpdateRequest, aluguel);
        aluguelRepository.save(aluguel);
    }

    @Override
    public void deleteById(Long id) {
        aluguelRepository.deleteById(id);
    }
}
